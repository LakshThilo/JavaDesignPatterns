package lak.designPatterns.behavioral.visitorPattern.adjectingEmployeeSalaryEmpl.before;

public interface Visitor {

    void visit(Manager manager);
    void visit(SalesPerson salesPerson);
    void visit(StaffList staffList);

}
