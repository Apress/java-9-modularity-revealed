package com.apress.moduleB;

import com.apress.moduleA.*;

public class MainClass {

    public static void main(String[] args) {
        EmployeeImpl employeeImpl = new EmployeeImpl();
        employeeImpl.createNewEmployee();
        employeeImpl.setEmployeeInfo();
        employeeImpl.getEmployeeInfo();
    }
}