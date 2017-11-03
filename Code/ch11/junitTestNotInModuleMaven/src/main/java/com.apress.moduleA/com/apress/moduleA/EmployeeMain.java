package com.apress.moduleA;

import com.apress.moduleA.entity.Employee;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeImpl employeeImpl = new EmployeeImpl();
        Employee employee = employeeImpl.setEmployeeInfo();
        System.out.println("Employee first name is: " + employee.getFirstName());
        System.out.println("Employee last name is: " + employee.getLastName());
        System.out.println("Employee department is: " + employee.getDepartment());

    }


}
