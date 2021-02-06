package lak.designPatterns.behavioral.interpreterPattern.newFeatureEmpl;

public class Client {

    public static void main(String[] args) {

        String context = "_Int";
        FirstLetterNotUnderscore firstLetterNotUnderscore = new FirstLetterNotUnderscore();
        context = firstLetterNotUnderscore.interpret(context);
        System.out.println(context);
    }
}
