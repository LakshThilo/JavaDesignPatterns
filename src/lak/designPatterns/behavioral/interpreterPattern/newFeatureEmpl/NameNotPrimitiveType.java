package lak.designPatterns.behavioral.interpreterPattern.newFeatureEmpl;

public class NameNotPrimitiveType implements Expression {

    @Override
    public String interpret(String context) {
        if(context.equals("int") || context.equals("double") || context.equals("float") || context.equals("boolean")) {
            context = context + 1;

        }
        return context;
    }
}
