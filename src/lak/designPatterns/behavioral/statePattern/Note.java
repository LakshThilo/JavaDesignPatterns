package lak.designPatterns.behavioral.statePattern;

public class Note {

    /*
      Sometimes you will have an object that needs to behave differently depending on its internal states. The state
      pattern allows the object to alter its behavior when its state changes.

      Imagine a play or pause button on a media player. If someone clicks the play button, what happens will depend
      on the state of the media player. For example, it could be already playing, or paused, or rewinding, and so on.
      If you write a media play in Java, you might end up with loads of if statements about the state of the player.

      For example, you'd check if it was playing and then have the code to handle that scenario, and then check if it
      was paused and then have some code to handle that scenario, and so on. This can get quite lengthy and complex.
      You'd also need these long if statements at every method you created, so in the pause method, and the rewind method,
      and so on, as well as the play method.

      The state pattern provides a better solution to this problem. The state is separated out as a separate object from
      the clients. Usually there is an interface for states and then concretes implementations for different states.
      So for example, in the media player example, the media play itself would be the clients, and then there would be
      a concrete implementation of state for going into stopped or playing, and so on. Any of the operations performed
      by the clients that depend on the state of it are handled by these concrete implementations of the state's interface. */

      /**So the state pattern is a way of avoiding huge if/else blocks or switch statements. And in this
      way, it can help simplify the code. The state pattern allows an object to change its behavior when its internal state changes.*/
}
