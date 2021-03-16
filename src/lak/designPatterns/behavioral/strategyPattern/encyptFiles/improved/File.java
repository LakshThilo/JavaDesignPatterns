package lak.designPatterns.behavioral.strategyPattern.encyptFiles.improved;

//Context
public class File {

    private String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }

    // going to pass an encryptor object into this method,  I'll be able to pass in any implementation of my encryptor interface
    public void encrypt(Encryptor encryptor){
        System.out.println(encryptor.encryptFile() + " to "+ fileName);

    }
}
