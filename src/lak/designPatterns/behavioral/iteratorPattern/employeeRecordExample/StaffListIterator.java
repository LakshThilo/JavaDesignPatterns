package lak.designPatterns.behavioral.iteratorPattern.employeeRecordExample;

import java.util.Iterator;

public class StaffListIterator implements Iterator {

    private StaffList staffList;
    private  int index;

    public StaffListIterator(StaffList employees) {

        this.staffList = employees;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        Employee[] employees = staffList.getEmployees();

      if(index < employees.length) {
          return true;
      } else {
          return false;
      }
    }

    @Override
    public Employee next() {
        Employee[] employees = staffList.getEmployees();
        if(hasNext()){
            Employee employee = employees[index++];
            return employee;
        }
        return null;
    }

    @Override
    public void remove() {

    }
}
