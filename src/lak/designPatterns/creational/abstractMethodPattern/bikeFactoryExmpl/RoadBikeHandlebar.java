package lak.designPatterns.creational.abstractMethodPattern.bikeFactoryExmpl;

public class RoadBikeHandlebar extends Handlebar{

    private static String type = "DROP";

    @Override
    void getDescription() {
        System.out.println("Road bike handler. Type: "+type);
    }
}
