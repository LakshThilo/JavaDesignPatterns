package lak.designPatterns.creational.singletonPattern.ex1_printSpooler;

public class ResourceManager {

    public static void main(String[] args) {

        PrintSpooler spooler = PrintSpooler.getInstance();
        PrintSpooler spooler2 = PrintSpooler.getInstance();
        PrintSpooler spooler3 = PrintSpooler.getInstance();
    }
}
