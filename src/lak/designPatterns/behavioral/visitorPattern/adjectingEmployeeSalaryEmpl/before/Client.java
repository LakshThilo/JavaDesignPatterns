package lak.designPatterns.behavioral.visitorPattern.adjectingEmployeeSalaryEmpl.before;

public class Client {

    /*. In this one, you're going to be refactoring an app that's used for adjusting employee salaries using the visitor
    pattern. So, let's have a quick look at the code. There's an interface called employee, which has a single methods
    called get salary, which returns an integer. Then there are two concrete implementations called manager and sales person.
    These both have a salary field where the getter and setter for the salary. Then there is the staff list class, which
    also implements employee. This contains an array list of employees and in the constructor, a manager and two
    salespeople are added to this list.*/

    public static void main(String[] args) {

        StaffList staffList = new StaffList();
        System.out.println("Total amount paid to staff: "+ staffList.getSalary());

    }

    /* In this exercise, imagine that someone wants to perform salary adjustments on each different type of staff member.
    Say for example, they want to increase all managers salaries to 65,000 and all salespeople salaries to 57,000.
    You should implement the visitor pattern so that each type of employee salary can be adjusted differently.
    Without putting the code for adjusting salaries in those classes.*/
}
