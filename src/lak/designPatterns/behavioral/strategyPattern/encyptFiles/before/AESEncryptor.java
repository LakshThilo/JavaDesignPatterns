package lak.designPatterns.behavioral.strategyPattern.encyptFiles.before;

//Strategy 1
public class AESEncryptor implements Encryptor {


    @Override
    public String encryptFile() {
        return "Applying AES encryption";
    }
}
