package com.teacherreis.com.view;

import com.teacherreis.com.model.Employee;

public class EmployeeDashboardView {

    private Employee employee;

    public void printEmployeeInformation(Employee employee){
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("SSN: " + employee.getSsNumber());
        System.out.println("Salary is :" + employee.getSalary());
    }
}
