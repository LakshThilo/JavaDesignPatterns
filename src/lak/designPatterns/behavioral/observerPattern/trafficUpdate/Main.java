package lak.designPatterns.behavioral.observerPattern.trafficUpdate;

public class Main {

    public static void main(String[] args) {

        City sunnyville = new City();
        City springfeild = new City();
        TrafficUpdates trafficUpdates = new TrafficUpdates();

        sunnyville.addPropertyChangeListener(trafficUpdates);
        springfeild.addPropertyChangeListener(trafficUpdates);

        sunnyville.updateTraffic("Congestion in town center");
        springfeild.updateTraffic("Accident on the highway");

        trafficUpdates.getUpdates();

    }
}
