package com.wgx.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wgx
 * @since 2023/4/11 15:06
 */
public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployees(new EmployeeManager());
    }
}

class Employee {
    int id;
}

class EmployeeManager {
    public List<Employee> getEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.id = i;
            employees.add(employee);
        }
        return employees;
    }

    public void printAllEmployees() {
        List<Employee> employees = getEmployees();

        for (Employee employee : employees) {
            System.out.println(employee.id);
        }
    }
}

class SchoolManager {
    public void printAllEmployees(EmployeeManager employeeManager) {
        employeeManager.printAllEmployees();
    }
}
