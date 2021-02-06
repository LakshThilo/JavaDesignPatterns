package lak.designPatterns.behavioral.observerPattern.socialMedia.before;

import java.util.ArrayList;

public class SocialMediaFeed {

    private ArrayList statues = new ArrayList<>();

    public void printStatuses(){

        statues.forEach(System.out::print);
    }
}
