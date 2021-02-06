package lak.designPatterns.behavioral.interpreterPattern.checkGrammerMistakeEmpl.after;

import lak.designPatterns.behavioral.interpreterPattern.newFeatureEmpl.Expression;

public class FirstLetterNotUnderscore implements Expression {

   private FirstLetterIsLowerCase firstLetterIsLowerCase = new FirstLetterIsLowerCase();

    @Override
    public String interpret(String context) {
       if(context.startsWith("_")){
           context = context.substring(1);
       }
       return firstLetterIsLowerCase.interpret(context);
    }
}
