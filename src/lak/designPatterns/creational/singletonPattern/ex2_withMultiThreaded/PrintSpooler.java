package lak.designPatterns.creational.singletonPattern.ex2_withMultiThreaded;

/*  Thread one calls the method first. The first line of the getInstance method checks if the initialized flag is set to true or false.
    As this is the first time the PrintSpooler class has been used in the program this is set to false. So the thread carries onto
    the second line when it creates a new principle object. It then enters the code to initialize the object. At this time the second
    thread might call a getInstance method. Again, the first thing that happens when a method begins is a check to see if the
    initialized flag is set to true. The first thread is still inside the init method. It hasn't yet set the initialized flag to true.
    So the second thread also goes to the second line and creates a PrintSpooler object.

    Now there are two PrintSpoolers. This seems like quite a complicated problem to solve, but actually it is very easy to stop
    this from happening. The only change that is needed is to make the getInstance method synchronized.*/

   /** Synchronized is a Java keyword that restricts access to the code inside the method*/
   /* If the program was run again now that getInstance is a synchronized method the problem would be fixed. Thread one
      would enter the getInstance method, and it would be locked until it had finished. Thread two would not be able to
      enter that code until the spooler object had been created and theinitialized flag had been set to true.

      One draw back to bear in mind when using synchronized methods is that they can slow the program down. This is because
      threads are having to wait for other threads to finish methods first.

      There is a further way to improve this PrintSpooler class. Instead of creating the spooler object inside the getInstance
      method it can be created when the field is first declared. Then we can also make the field final. This way even if the
      getInstance method was not synchronized it would still be impossible to create two spoolers. This is because the spooler
      object would already have been created before the getInstance method was called. However, the getInstance method still
      needs to be synchronized to protect against the init method being called twice. In general, discussions of the singleton
      pattern it is sometimes advised that it is better to keep the object creation inside the getInstance method.

      This is because creating an object as soon as the class is loaded is an example of eager initialization. It has been created
      before it is certain that it will be needed. Keeping it inside the getInstance method would mean that the spooler object
      was only created when it was definitely going to be used. This is known as lazy initialization.

       However, in Java this is not an issue because Java already uses lazy loading. It is unlikely the PrintSpooler class will be loaded in the JVM unless
      the getInstance method is called. So there is no problem with moving the creation of the spooler out of getInstance.*/


public class PrintSpooler {
    
    private static final PrintSpooler spooler = new PrintSpooler();;
    
    private static boolean initialized = false;

    private PrintSpooler(){}

    private void init() {
        System.out.println("Object has been created");
    }

    
    public static synchronized PrintSpooler getInstance(){
        if(initialized){
            System.out.println("Object already been created");
            return spooler;
        }
        spooler.init();
        initialized = true;
         return spooler;
    }

}
