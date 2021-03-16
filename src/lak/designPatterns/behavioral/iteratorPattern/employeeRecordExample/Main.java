package lak.designPatterns.behavioral.iteratorPattern.employeeRecordExample;

public class Main {

    /*In this one, there is an app that keeps a record of employees, and the exercise is to use the iterator pattern,
     to traverse the list and print out the name of each employee. */
    public static void main(String[] args) {

        Employee zak = new Employee("Zak");
        Employee sarah = new Employee("Sarah");
        Employee anna = new Employee("Anna");

        StaffList staffList = new StaffList(zak,sarah,anna);

        StaffListIterator staffListIterator = staffList.iterator();

        while (staffListIterator.hasNext()){
            Employee employee = staffListIterator.next();
            System.out.println(employee.getName());
        }

    }
}
