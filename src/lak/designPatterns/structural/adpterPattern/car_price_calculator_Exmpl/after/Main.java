package lak.designPatterns.structural.adpterPattern.car_price_calculator_Exmpl.after;

import org.example.UKCarPriceCalculator;

public class Main {

    public static void main(String[] args) {

        CarPriceCalculator carPriceCalculator = new CarPriceCalculator("Ford",3);
        printVehiclePrice(carPriceCalculator);

        TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator(10, 0);
        printVehiclePrice(truckPriceCalculator);


        /*  this is how the adapter pattern can enable you to use classes in your application that you wouldn't otherwise
            be able to because they don't fit with your class hierarchy.*/
        UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator("BMW",7 );
        Adapter adapter = new Adapter(ukCarPriceCalculator);
        printVehiclePrice(adapter);
    }

    public static void printVehiclePrice(PriceCalculator calculator) {
        String price = calculator.calculatePrice();
        System.out.println("The price of vehicle is: "+price);
    }
}
