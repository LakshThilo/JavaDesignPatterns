package lak.designPatterns.structural.flyweightPattern.numberOfCarsInGivenAreaExmpl.after;

public class Truck implements Vehicle{

    private int[] location = new int[2];
    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public int[] getLocation() {
        return location;
    }

    @Override
    public void setLocation(int latitude, int longitude) {
        location[0] = latitude;
        location[1] = longitude;
    }
}
