package lak.designPatterns.creational.singletonPattern.ex1_printSpooler;


/*Here is a public class called PrintSpooler that implements the singleton pattern. The PrintSpooler class has a
private static field called spooler, which is of type, PrintSpooler. This is the one and only instance of the
PrintSpooler class. There is another private static field which is called initialized. This is a Boolean flag
to mark if the object has been initialized. Before the first PrintSpooler object is created, this flag is set to False.
The most important part of the PrintSpooler class is the private constructor. Having a private constructor prevents
code from any other class creating new PrintSpooler objects. The only place to create PrintSpooler objects is from
within the PrintSpooler class itself. This way, the constructor is only called once. In this example, that happened
when the instance variable is initialized*/



public class PrintSpooler {
    
    private static PrintSpooler spooler;
    
    private static boolean initialized = false;

    private PrintSpooler(){}

    private void init() {
        System.out.println("Object has been created");
    }

    /*
        Note that initialization of the object is also separated out in a private method called init. In this example,
        the method is empty to keep the example simple, but in a more complex program, the code to initialize the PrintSpooler
        object would go here. The initialization is separated out because for the singleton pattern to work, it must be
        impossible to get a reference to the objects in an uninitialized state. The program needs a global point of access
        to the one PrintSpooler object, so that it can be used in other classes. This is done with the public method, getInstance().
        First, the method checks if the object has already been initialized. If it has, and the flag is set to True, it will return
        that instance. If it hasn't been initialized, a new PrintSpooler object will be created, and then initialized by calling
        the init method. Then the flag will be set to True, and the new instance is returned. If the method is called a second time,
        the initialized flag will have been set to True, and will return the first instance. It is now impossible to create a second
        instance of the PrintSpooler class, and it is just as simple to get this instance from another class.*/
    
    public static PrintSpooler getInstance(){
        if(initialized){
            System.out.println("Object already been created");
            return spooler;
        }
        spooler = new PrintSpooler();
        spooler.init();
        initialized = true;
         return spooler;
    }

}
