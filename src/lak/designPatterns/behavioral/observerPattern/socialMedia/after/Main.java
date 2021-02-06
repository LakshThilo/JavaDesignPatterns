package lak.designPatterns.behavioral.observerPattern.socialMedia.after;

public class Main {

    public static void main(String[] args) {

        Connection sally = new Connection();
        Connection bob = new Connection();

        SocialMediaFeed feed = new SocialMediaFeed();

        sally.addPropertyChangeListener(feed);
        bob.addPropertyChangeListener(feed);

        sally.setStatus("going out a walk");
        bob.setStatus("eating my lunch");

        feed.printStatuses();

    }

}
