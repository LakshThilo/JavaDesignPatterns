package lak.designPatterns.behavioral.visitorPattern.adjectingEmployeeSalaryEmpl.before;

public interface Employee {

    int getSalary();
    void accept(Visitor visitor);
}
