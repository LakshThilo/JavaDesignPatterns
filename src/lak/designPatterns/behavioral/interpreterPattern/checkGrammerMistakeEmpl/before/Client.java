package lak.designPatterns.behavioral.interpreterPattern.checkGrammerMistakeEmpl.before;

public class Client {

    /*  In this one, you're going to be working on an app that checks for simple grammar mistakes in a sentence.
    The structure of the app will be very similar to the variable checker app
    In the main method, we've got a screen called "context," which has a sentence we want to interpret, which says
    "this is a a sentence." You should use the interpreter pattern to create a syntax tree, then we check three things.
    First of all, the first letter of the first word should be an uppercase letter. Secondly, it should contain no
    repeated words. Although there are obviously some cases where a word might be repeated in a sentence, to keep
    things simple here, we're assuming this is always a mistake. And thirdly, the sentence should end with a period.*/
    public static void main(String[] args) {

        String context = HelperMethod.noRepeatedWords("ab ab ac ac ac ac sc ab ds ds ds dsac dsac");
        context = HelperMethod.endsWithPeriod(context);

        System.out.println(context);
    }
}
