package lak.designPatterns.creational.singletonPattern.ex2_withMultiThreaded;

public class ResourceManager {

    /*  Problems can occur when using the singleton pattern in a multi-threaded program. Java supports concurrency
    which means multiple units of execution can run at the same time. If a program has multiple threads that are using
    the PrintSpooler class it is possible for two different objects to be created.

    In this example, the ResourceManager class has two threads running at the same time. Thread one is started and right
    after thread two is also started. Both threads call a getInstance method of the PrintSpooler class. */
    public static void main(String[] args) {

        PrintSpooler spooler = PrintSpooler.getInstance();

        Thread threadOne = new Thread(() -> {PrintSpooler spooler1 = PrintSpooler.getInstance();});
        Thread threadTwo = new Thread(() -> {PrintSpooler spooler1 = PrintSpooler.getInstance();});

        threadOne.start();
        threadTwo.start();
    }
}
