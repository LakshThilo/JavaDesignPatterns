package lak.designPatterns.behavioral.mediatorPattern.airTrafficController.after;

public class Mediator {

    private Plane plane;
    private PlaneInFlight planeInFlight;
    private PlanesOnGround planesOnGround;
    private Runway runway;

    public Mediator(){

        plane = new Plane(123);
        planeInFlight = new PlaneInFlight();
        planesOnGround = new PlanesOnGround();
        runway = new Runway();
    }

    public void takeOff() {

        if (!plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane "+plane.getId() +" is taking off...");
            planesOnGround.removePlane(plane);
            planeInFlight.addPlane(plane);
           plane.setIsInTheAir(true);
            runway.setIsAvailable(false);
        }
    }

}
