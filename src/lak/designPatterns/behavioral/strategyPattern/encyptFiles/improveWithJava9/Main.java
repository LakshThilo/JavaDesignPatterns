package lak.designPatterns.behavioral.strategyPattern.encyptFiles.improveWithJava9;

public class Main {

    public static void main(String[] args) {


         /* instead of creating this new AESEncryptor object, I could replace this with a Lambda. So I could delete this,
        and instead have a pair of brackets and an arrow, and the string, applying AES encryption. And I also need to
        change this to an encryptor object instead of AES Encrypto*/
         //Using classic strategy Pattern
        /*File file = new File("test.pdf");
        Encryptor aesEncryptor = () -> "Applying AES encryption";
        file.encrypt(aesEncryptor);*/

        /** I could then go ahead and delete the AES encryption class altogether.
        . However, I don't really want to define my encryption algorithm inside this main class. I still want to
         * define it somewhere that's going to be easy to maintain. Since Java 8, you can actually define static methods
         * inside an interface. So this means that another option is to just define a new method for each type of
         * encryption inside the encrypted interface itself. */


        // Using Java 8 features
        /* I can also go ahead and delete my concrete implementations of the encryptor.
         And if I want to add more encryption types, I can just keep defining them inside the encryptor interface.*/
        File file = new File("test.pdf");
        file.encrypt(Encryptor.rsaEncryptor);
    }

}
