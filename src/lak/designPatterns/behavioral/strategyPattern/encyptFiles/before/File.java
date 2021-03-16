package lak.designPatterns.behavioral.strategyPattern.encyptFiles.before;

//Context
public class File {

    private String fileType;

    public File(String file){

        fileType = file;
    }

    public void applyRSAEncryption(){

        System.out.println("Applying RSA encryption for given "+fileType +" file");
    }

    public void applyAESEncryption(){

        System.out.println("Applying AES encryption for given "+fileType + " file");
    }
}
