package lak.designPatterns.behavioral.interpreterPattern.newFeatureEmpl;

/* In this example, I'm going to implement a new feature similar to those used by your IDE to alter variable names to meet Java naming conventions using the interpreter pattern*/

public interface Expression {

    // this context variable is going to be the variable name that I want to manipulate.
    String interpret(String context);

}
