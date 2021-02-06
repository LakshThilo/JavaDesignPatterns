package lak.designPatterns.structural.flyweightPattern.numberOfCarsInGivenAreaExmpl.before;

public interface Vehicle {

    String getType();
    int[] getLocation();
    void setLocation(int latitude, int longitude);
}
