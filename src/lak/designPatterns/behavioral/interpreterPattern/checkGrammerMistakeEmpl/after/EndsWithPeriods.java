package lak.designPatterns.behavioral.interpreterPattern.checkGrammerMistakeEmpl.after;

public class EndsWithPeriods implements Interpret {


    @Override
    public String interpret(String context) {

        if(!context.endsWith(".")){
            context = context + ".";
        }
        return context;
    }

}
