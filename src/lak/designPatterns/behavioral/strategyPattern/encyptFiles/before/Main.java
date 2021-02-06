package lak.designPatterns.behavioral.strategyPattern.encyptFiles.before;


/*  In this example, I'm going to create an application that can encrypt files in different ways using the strategy pattern.
    So I want to be able to encrypt these files, but I want to be able to choose at run time which type of encryption I want
    to use. So the first thing I'm going to do is I'm going to create an interface for the strategy*/

/*  I've created my file encryption app, which uses the strategy pattern to make sure it's simple and maintainable.
    But there are still ways I could improve it using some of the newer features of Java. You might have noticed that
    the encryptor interface is actually a functional interface, because it contains a single unimplemented method. So
    instead of creating concrete implementations of it, I could use the Java eight's Lambda feature instead.*/

public class Main {


    public static void main(String[] args) {

        File file = new File("test.pdf");
        AESEncryptor aesEncryptor = new AESEncryptor();
        file.encrypt(aesEncryptor);
    }
}
