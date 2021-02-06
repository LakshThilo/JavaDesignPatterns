package lak.designPatterns.creational.factoryMethodPattern.candyExmpl_hieracy;

import java.util.ArrayList;

public class CandyFactory {


    public static Candy getCandy(String type){
        switch(type){
            case "dark":
                return new ChocolateDark();
            case "white":
                return new ChocolateWhite();
            case "milk":
                return new ChocolateMilk();
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

    public static ArrayList getCandyPackage(int quantity, String type, String section){

        Candy candy = getCandy(type);

        if(section.equals("hard candy")){
            if(quantity % 10 !=0){
                System.out.println("Hard candy must be packaged in multiples of 10.");
                return null;
            }
        }
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}
