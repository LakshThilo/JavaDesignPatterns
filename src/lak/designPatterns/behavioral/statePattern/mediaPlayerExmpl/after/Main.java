package lak.designPatterns.behavioral.statePattern.mediaPlayerExmpl.after;

public class Main {

    /** The first thing I'm going to do now is I'm going to create an interface for the state of the MediaPlayer.
     * So I'm going to go ahead and create a new Java interface. And I'm going to call it State. I want to move
     * the functionality in the MediaPlayer that depends on its state into the implementations of this interface.
     * So I'm going to define play and pause methods.*/

    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.play();
        mediaPlayer.pause();

    }
}
