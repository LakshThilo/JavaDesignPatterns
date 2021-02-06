package lak.designPatterns.creational.factoryMethodPattern.candyExmpl.before;

import java.util.ArrayList;

/*  The problem with this approach is all the code for creating the candy is in the CandyStore class. If the makeCandyPackage
    method changes, then the getCandyPackage method will have to change too. Also, it is unlikely the candy store will want to
    sell only two different types of candy. In reality, new candy is going to be added, and sometimes, the store might stop
    selling certain types of candy. Every time this happens, the getCandy method has to change. It is also going to get very long.
    The first step that can be taken is to move this code out of the CandyStore class. There needs to be a new class to put it in.
   */
public class CandyStore {

    public static void main(String[] args){


    }

    public static Candy getCandy(String type){
        switch(type){
            case "hard candy":
                return new HardCandy();
            case "chocolate":
                return new Chocolate();
            default:
                return null;
        }
    }

    public static ArrayList getCandyPackage(int quantity, String type){

        Candy candy = getCandy(type);
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}
