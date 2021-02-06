package lak.designPatterns.creational.prototypePattern.mutability_expl.before;

/*  Problems can arise with the Cloneable interface when classes have fields that are mutable. If the field types are
    primitive values like string or int, there will probably not be any issues, but if the field types are other classes,
    there may be problems. In this example, there is a class called Rabbit and another class called Person. The Person class
    has a field called Name, and methods to get and set the name of the person.*/

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
