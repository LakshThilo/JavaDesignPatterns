package lak.designPatterns.behavioral.statePattern.mediaPlayerExmpl.after;

public class PlayingState implements State {
    @Override
    public void pause(MediaPlayer mediaPlayer) {

        mediaPlayer.setState(new PauseState());
        mediaPlayer.setIcon("play button");
        System.out.println("Video pause, icon set to "+mediaPlayer.getIcon());
    }

    @Override
    public void play(MediaPlayer mediaPlayer) {

    }
}
