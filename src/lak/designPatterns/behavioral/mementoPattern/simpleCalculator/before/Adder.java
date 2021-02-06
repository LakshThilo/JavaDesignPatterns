package lak.designPatterns.behavioral.mementoPattern.simpleCalculator.before;

public class Adder {

    private int result;

    public void add(int newNumber){

        result += newNumber;
    }

    public int getResult(){

        return result;
    }
}
