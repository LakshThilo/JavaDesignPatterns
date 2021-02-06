package lak.designPatterns.behavioral.interpreterPattern.checkGrammerMistakeEmpl.before;

public class Client {

    public static void main(String[] args) {

        String context = HelperMethod.noRepeatedWords("ab ab ac ac ac ac sc ab ds ds ds dsac dsac");
        context = HelperMethod.endsWithPeriod(context);

        System.out.println(context);
    }
}
