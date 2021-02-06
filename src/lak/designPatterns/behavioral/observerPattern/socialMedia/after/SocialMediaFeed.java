package lak.designPatterns.behavioral.observerPattern.socialMedia.after;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

/* The first thing I'm going to do is I'm going to make this class implement the property change listener class
This is going to allow me to listen for changes in any objects it's observing. And I'll also need to implement
a method from this interface called propertyChange,*/

//Observer
public class SocialMediaFeed implements PropertyChangeListener {

    private ArrayList statues = new ArrayList<>();

    public void printStatuses(){

        statues.forEach(System.out::println);
    }

//     My connection class is going to fire an event when the status field changes. So when that happens, I want to add it to my list of statuses in this class.
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        statues.add((String) evt.getNewValue());
    }
}
