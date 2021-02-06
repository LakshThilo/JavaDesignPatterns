package lak.designPatterns.behavioral.mediatorPattern.airTrafficController.before;

import java.util.ArrayList;

public class PlaneInFlight {

    ArrayList<Plane> planes = new ArrayList<>();

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void removePlane(Plane plane) {
        planes.remove(plane);
    }
}
