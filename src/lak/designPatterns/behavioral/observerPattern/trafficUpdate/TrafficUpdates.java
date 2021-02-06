package lak.designPatterns.behavioral.observerPattern.trafficUpdate;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

//Observer
public class TrafficUpdates implements PropertyChangeListener {

    private ArrayList updates = new ArrayList();

    public void getUpdates(){
        updates.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        updates.add((String) evt.getNewValue());
    }
}
