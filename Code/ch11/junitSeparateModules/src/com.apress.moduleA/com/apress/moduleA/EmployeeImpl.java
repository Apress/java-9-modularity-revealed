package com.apress.moduleA;

import com.apress.moduleA.entity.Employee;

public class EmployeeImpl {

    public Employee employee;

    public EmployeeImpl() {
    }

    public Employee createNewEmployee() {
        employee = new Employee();
        return employee;
    }

    public Employee setEmployeeInfo() {
        employee = createNewEmployee();
        employee.setFirstName("John");
        employee.setLastName("Anderson");
        employee.setDepartment("IT");
        return employee;
    }

    public void getEmployeeInfo() {
        System.out.println("Employee first name is: " + employee.getFirstName());
        System.out.println("Employee last name is: " + employee.getLastName());
        System.out.println("Employee department is: " + employee.getDepartment());
    }

}