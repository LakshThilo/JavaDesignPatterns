package lak.designPatterns.behavioral.strategyPattern.encyptFiles.before;

//Strategy 2
public class RSAEncryptor implements Encryptor {

    @Override
    public String encryptFile() {
        return "Applying RSA encryption";
    }
}
