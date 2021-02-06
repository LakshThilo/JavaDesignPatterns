package lak.designPatterns.behavioral.observerPattern.trafficUpdate;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// observable
public class City {

    private String trafficUpdates = "";
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void updateTraffic(String trafficUpdates){
        support.firePropertyChange("trafficUpdate", this.trafficUpdates, trafficUpdates);
        this.trafficUpdates = trafficUpdates;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }
}
