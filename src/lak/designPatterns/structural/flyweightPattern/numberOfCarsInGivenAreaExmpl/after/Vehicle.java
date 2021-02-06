package lak.designPatterns.structural.flyweightPattern.numberOfCarsInGivenAreaExmpl.after;

public interface Vehicle {

    String getType();
    int[] getLocation();
    void setLocation(int latitude, int longitude);
}
