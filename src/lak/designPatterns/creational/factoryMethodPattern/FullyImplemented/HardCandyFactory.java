package lak.designPatterns.creational.factoryMethodPattern.FullyImplemented;


public class HardCandyFactory extends CandyFactory {
    @Override
    public Candy getCandy(String section) {
        switch (section) {
            case "candycane":
                return new HardCandyCandyCane();
            case "lollipop":
                return new HardCandyLollipop();
            case "peppermint":
                return new HardCandyPeppermint();
            default:
                return null;
        }
    }
}
