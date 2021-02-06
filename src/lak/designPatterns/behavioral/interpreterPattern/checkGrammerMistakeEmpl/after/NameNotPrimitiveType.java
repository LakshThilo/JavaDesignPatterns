package lak.designPatterns.behavioral.interpreterPattern.checkGrammerMistakeEmpl.after;

import lak.designPatterns.behavioral.interpreterPattern.newFeatureEmpl.Expression;

import java.util.Arrays;
import java.util.List;

public class NameNotPrimitiveType implements Expression {

    private NoRepeatedWords noRepeatedWords = new NoRepeatedWords();

    @Override
    public String interpret(String context) {

        List<String> list = Arrays.asList(context.split(" "));
        int size = list.size() - 1;

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<size; i++){
            String word = list.get(i);
            if(word.equals("int") || word.equals("double") || word.equals("float") || word.equals("boolean")) {
                word = word + 1;
                sb.append(word).append(" ");
            }
            else {
                sb.append(word).append(" ");
            }
        }

        context = sb.toString();
        return noRepeatedWords.interpret(context);
    }
}
