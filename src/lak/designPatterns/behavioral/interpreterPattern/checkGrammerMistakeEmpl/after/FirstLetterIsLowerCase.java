package lak.designPatterns.behavioral.interpreterPattern.checkGrammerMistakeEmpl.after;

import lak.designPatterns.behavioral.interpreterPattern.newFeatureEmpl.Expression;

public class FirstLetterIsLowerCase implements Expression {

    private NameNotPrimitiveType nameNotPrimitiveType = new NameNotPrimitiveType();
    @Override
    public String interpret(String context) {
        context = context.substring(0, 1).toLowerCase() + context.substring(1);

        // context.substring(0, 1) this will give the first letter
        // context.substring(0, 1).toLowerCase() will give all in lower case
        // add rest of string back on -> + context.substring(1)

        return nameNotPrimitiveType.interpret(context);
    }
}
