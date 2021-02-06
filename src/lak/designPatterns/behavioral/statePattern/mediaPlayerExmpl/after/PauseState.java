package lak.designPatterns.behavioral.statePattern.mediaPlayerExmpl.after;

public class PauseState implements State {
    @Override
    public void pause(MediaPlayer mediaPlayer) {
        
    }

    @Override
    public void play(MediaPlayer mediaPlayer) {

        mediaPlayer.setState(new PlayingState());
        mediaPlayer.setIcon("pause button");
        System.out.println("Video playing, icon set to "+ mediaPlayer.getIcon());
    }
}
