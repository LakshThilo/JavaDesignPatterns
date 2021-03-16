package lak.designPatterns.behavioral.visitorPattern.adjectingEmployeeSalaryEmpl.after;

public interface Employee {

    int getSalary();
    void accept(Visitor visitor);
}
