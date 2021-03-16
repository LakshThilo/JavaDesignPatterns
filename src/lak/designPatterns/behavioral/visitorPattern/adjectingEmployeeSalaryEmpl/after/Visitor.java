package lak.designPatterns.behavioral.visitorPattern.adjectingEmployeeSalaryEmpl.after;

public interface Visitor {

    void visit(Manager manager);
    void visit(SalesPerson salesPerson);
    void visit(StaffList staffList);

}
