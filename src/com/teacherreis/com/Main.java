package com.teacherreis.com;

import com.teacherreis.com.controller.EmployeeController;
import com.teacherreis.com.model.Employee;
import com.teacherreis.com.view.EmployeeDashboardView;

public class Main {

    public static void main(String[] args) {

        //declaring and initializing an Employee object names "employee" to
        // the values returned from the method call to retrieveEmployeeFromServer()
        Employee employee = retrieveEmployeeFromServer();

        //create our view to which we'll write our employee information into
        EmployeeDashboardView view = new EmployeeDashboardView();

        //create our controller
        EmployeeController controller = new EmployeeController(employee, view);

        controller.updateDashboardView();

    }
    //no explicit constructor is required for an Employee object.
    //four instance variables were declared in class Employee
    //getters and setters were generated in class Employee
    //an instance variable of type Employee was declared in both EmployeeDashboardView and EmployeeController
    public static Employee retrieveEmployeeFromServer(){
        Employee employee = new Employee();
        employee.setSsNumber("1234567");
        employee.setFirstName("Yo");
        employee.setLastName("Mama");
        employee.setSalary(123000);

        return employee;
    }
}
