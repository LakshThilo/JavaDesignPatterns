package lak.designPatterns.behavioral.observerPattern.socialMedia.before;

public class Main {

    /* if I run this app now, nothing at all happens. This is because the feeds doesn't know anything about Sally or Bob.
    They're completely separate objects that aren't related. But I want the feed to update when Sally or Bob update their statuses.

     I could maintain a list of connections inside the SocialMediaFeed class, but that would make the classes tightly coupled.
     If I changed the implementation of the connection class, I might have to go back and change something in the SocialMediaFeed
     class as well. So I'm going to use the observer pattern, and to do this, I'm going to make use of the property change
     listener and property change support classes, which come as parts of the JDK.*/

    /**  In this example, the connection is the observable and the SocialMediaFeed is the observer. So let's start with the observer, the SocialMediaFeed class. */
    public static void main(String[] args) {

        Connection sally = new Connection(); // observable
        Connection bob = new Connection();

        SocialMediaFeed feed = new SocialMediaFeed(); //observer

        sally.setStatus("going out a walk");
        bob.setStatus("eating my lunch");

        feed.printStatuses();

    }

}
