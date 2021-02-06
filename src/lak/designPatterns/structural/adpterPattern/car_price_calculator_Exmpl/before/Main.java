package lak.designPatterns.structural.adpterPattern.car_price_calculator_Exmpl.before;

import org.example.UKCarPriceCalculator;

/*  this app tells me the prices of vehicles in US dollars. But in other countries, the prices might be calculated differently,
    and I don't have any implementations for these. However, I do have a dependency on a third party app, called UK Car Price
    Calculator, which can be used to return the price of a car in British pounds using a different algorithm. So if I look inside
    my lib folder, I can see that I have a jar file called uk-car-price-calculator.*/
public class Main {

    public static void main(String[] args) {

        CarPriceCalculator carPriceCalculator = new CarPriceCalculator("Ford",3);
        printVehiclePrice(carPriceCalculator);

        TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator(10, 0);
        printVehiclePrice(truckPriceCalculator);

        UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator("BMW",7 );
        /** But I can't now call the print vehicle price method and pass in my UKCarPriceCalculator because printVehiclePrice
            is expecting a price calculator object. And this UKCarPriceCalculator knows nothing about the price calculator interface.
            So to make this work, I need to create an adapter*/

    }

    public static void printVehiclePrice(PriceCalculator calculator) {
        String price = calculator.calculatePrice();
        System.out.println("The price of vehicle is: "+price);
    }
}
