package lak.designPatterns.behavioral.visitorPattern.adjectingEmployeeSalaryEmpl.after;

public class Client {

    public static void main(String[] args) {

        StaffList staffList = new StaffList();
        System.out.println("Total amount paid to staff: "+ staffList.getSalary());
        staffList.accept(new SalaryAdjustmentVisitor());
        System.out.println("New total amount paid to staff: "+ staffList.getSalary());

    }
}
