package lak.designPatterns.behavioral.strategyPattern.encyptFiles.improveWithJava9;

/*  So instead of creating concrete implementations of it, I could use the Java eight's Lambda feature instead.*/

public interface Encryptor {

    String encryptFile();

    //create a new method to apply AES encryption and RSA encryption.
    Encryptor aseEncryptor = () -> "Applying ASE encryption";

    Encryptor rsaEncryptor = () -> "Applying RSA encryption";
}
