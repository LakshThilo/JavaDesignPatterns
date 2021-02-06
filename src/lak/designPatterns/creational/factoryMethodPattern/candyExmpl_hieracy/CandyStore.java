package lak.designPatterns.creational.factoryMethodPattern.candyExmpl_hieracy;

/*  In the Candy Store class we have to specify both the type of chocolate and the section it is in. It is likely that
    there will be more sections than just chocolates and hard candy in the store. The new sections might also have different
    ways of packaging the candy. Every time a new section is added with a new packaging style the method getCandyPackage is
    going to get longer and more complex. The code is now at a point where it is only going to get more complex and difficult
    to maintain. The way to improve this is to use a complete implementation of the Factory pattern method.*/
public class CandyStore {

    private static final CandyFactory candyFactory = new CandyFactory();

    public static void main(String[] args){

        candyFactory.getCandyPackage(12,"white", "chocolate");
        candyFactory.getCandyPackage(7,"dark", "chocolate");
        candyFactory.getCandyPackage(14,"lollipop", "hard candy");
        candyFactory.getCandyPackage(20,"peppermint", "hard candy");
    }

}
