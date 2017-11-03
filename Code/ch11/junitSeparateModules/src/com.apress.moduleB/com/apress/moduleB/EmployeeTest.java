package com.apress.moduleB;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import com.apress.moduleA.entity.Employee;

public class EmployeeTest {

    Employee employee;

    @Before
    public void setEmployeeData() {
        employee = new Employee();
        employee.setFirstName("Alexandru");
        employee.setLastName("Jecan");
        employee.setDepartment("IT");
    }

    @Test
    public void employeeDataTest() {
        Assert.assertEquals("Alexandru, Jecan, IT", employee.getEmployeeFullData());
    }
}