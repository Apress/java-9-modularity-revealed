package testReflection;

import java.lang.reflect.*;
import target.*;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("John");

        try {
            Field employeeField = Employee.class.getDeclaredField("employeeName");
            employeeField.setAccessible(true);
        }
        catch(NoSuchFieldException noSuchFieldException) {
        }

    }
}