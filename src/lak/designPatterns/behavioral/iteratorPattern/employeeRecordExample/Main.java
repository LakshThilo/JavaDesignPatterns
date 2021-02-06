package lak.designPatterns.behavioral.iteratorPattern.employeeRecordExample;

public class Main {

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
