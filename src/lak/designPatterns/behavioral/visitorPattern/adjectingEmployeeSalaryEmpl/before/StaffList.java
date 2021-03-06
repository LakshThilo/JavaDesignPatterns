package lak.designPatterns.behavioral.visitorPattern.adjectingEmployeeSalaryEmpl.before;

import java.util.ArrayList;

public class StaffList implements Employee{

    ArrayList<Employee> salaries = new ArrayList<>();

    public StaffList(){

        Manager manager = new Manager();
        SalesPerson salesPerson1 = new SalesPerson();
        SalesPerson salesPerson2 = new SalesPerson();
        salaries.add(manager);
        salaries.add(salesPerson1);
        salaries.add(salesPerson2);
    }

    @Override
    public int getSalary() {
        return salaries.stream().mapToInt(Employee::getSalary).sum();
    }


}
