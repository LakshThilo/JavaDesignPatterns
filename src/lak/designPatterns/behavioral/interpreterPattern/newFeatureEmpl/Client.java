package lak.designPatterns.behavioral.interpreterPattern.newFeatureEmpl;

public class Client {

    /*One of the possible uses of the interpreter pattern is interpreting code itself. You've probably come across
    features in your IDE that show you hints when there are things in your code that could be improved. One example
    is the organize inputs feature where your IDE will rearrange your input statements in alphabetical order and remove
    any unused ones. In this example, I'm going to implement a new feature similar to those used by your IDE to alter
    variable names to meet Java naming conventions using the interpreter pattern.*/
    public static void main(String[] args) {

        String context = "_Int";
        FirstLetterNotUnderscore firstLetterNotUnderscore = new FirstLetterNotUnderscore();
        context = firstLetterNotUnderscore.interpret(context);
        System.out.println(context);
    }
}
