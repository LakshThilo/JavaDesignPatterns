package lak.designPatterns.behavioral.interpreterPattern.newFeatureEmpl;

public class FirstLetterNotUnderscore implements Expression {

    FirstLetterIsLowerCase firstLetterIsLowerCase = new FirstLetterIsLowerCase();

    @Override
    public String interpret(String context) {
       if(context.startsWith("_")){
           context = context.substring(1);
       }
       return firstLetterIsLowerCase.interpret(context);
    }
}
