package lak.designPatterns.behavioral.interpreterPattern.newFeatureEmpl;



public interface Expression {

    // this context variable is going to be the variable name that I want to manipulate.
    String interpret(String context);

}
