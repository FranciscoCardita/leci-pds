package Ex1;

import java.util.*;

class Database { // Data elements
    private Vector<Employee> employees; // Stores the employees

    public Database() {
        employees = new Vector<>();
    }

    public boolean addEmployee(Employee employee) {
        if (employees.contains(employee))
            return false;
        employees.add(employee);
        return true;
    }

    public void deleteEmployee(long emp_num) {
        for (Employee e : employees) {
            if (e.getEmpNum() == emp_num) {
                employees.remove(e);
                break;
            }
        }
    }

    public Employee[] getAllEmployees() {
        Employee[] empList = new Employee[employees.size()];
        return employees.toArray(empList);
    }
}
