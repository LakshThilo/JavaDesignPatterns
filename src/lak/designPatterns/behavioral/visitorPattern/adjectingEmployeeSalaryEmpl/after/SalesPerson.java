package lak.designPatterns.behavioral.visitorPattern.adjectingEmployeeSalaryEmpl.after;

public class SalesPerson implements Employee {

    private int salary = 5000;

    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
