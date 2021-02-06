package lak.designPatterns.behavioral.observerPattern.socialMedia.after;


/* I'm going to go ahead and implement the observable, which in this example is the connection class.
So, I'm going to open up the connection class, and the first thing I'm going to do is I'm going to add
a new field of type property change support, which I'll call support. And so I'm going to assign
this to a new property change support instance. And I'm going to pass in this.*/

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

//observable
public class Connection {

    private String status = "";
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void setStatus(String status){

        /**I need to pass in three arguments to this fire property change method.
           - The first one is a string, which is the name of the property that has changed.
             So I'm going to pass in the string status. In my example, I'm going to be listening for all properties,
             but sometimes, you might want to only listen for specific ones, which is why I need to pass in the name of the property here.

           - The second argument is the old value, so I'm going to pass in this.status. And the

           - third argument is the new value that it's changing to, so I'm going to pass in the status
             which I'm passing in to this method. If the old and new values are the same, this method will do nothing, but
             if they're different, it will notify the observer that the status has changed.  */

        support.firePropertyChange("status", this.status, status);
        this.status = status;
    }

/** The last thing I need to do in this class is I need to create a method to add a listener so that observers can listen for changes.*/

    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

}
