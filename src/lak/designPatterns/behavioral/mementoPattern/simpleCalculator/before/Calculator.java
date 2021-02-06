package lak.designPatterns.behavioral.mementoPattern.simpleCalculator.before;

public class Calculator {

    public static void main(String[] args) {

        Adder adder = new Adder();
        adder.add(10);
        System.out.println(adder.getResult());
    }
}
