package lak.designPatterns.behavioral.interpreterPattern.checkGrammerMistakeEmpl.after;

public class Client {

    public static void main(String[] args) {

        String context = "ab ab ac ac ac ac sc ab ds ds ds dsac dsac";
        NoRepeatedWords noRepeatedWords = new NoRepeatedWords();
        context = noRepeatedWords.interpret(context);
        System.out.println(context);

        String contexts = "_Int int Boolean double Double";
        FirstLetterNotUnderscore firstLetterNotUnderscore = new FirstLetterNotUnderscore();
        contexts = firstLetterNotUnderscore.interpret(contexts);
        System.out.println(contexts);

    }
}
