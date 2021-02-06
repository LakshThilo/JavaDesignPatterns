package lak.designPatterns.behavioral.statePattern.mediaPlayerExmpl.before;

public class Main {

    /*This is quite a messy solution. If I was to add more states such as a rewind or fast forward,
    I would have to add to each switch statements and make it longer. And I'd have to add a new method
    for each where I would have to have more switch statements similar to the ones I already have.
    So there would be a lot of repetition and a lot of complex code. This might look quite familiar to you.
    I'm going to refactor this to use the state button instead by extracting out the states into their own classes.*/

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
