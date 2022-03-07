package com.teacherreis.com.controller;

import com.teacherreis.com.model.Employee;
import com.teacherreis.com.view.EmployeeDashboardView;

public class EmployeeController {

    private Employee employeeModel;
    private EmployeeDashboardView view;
    //Constructor here is boilerplate.
    public EmployeeController(Employee employeeModel, EmployeeDashboardView view) {
        this.employeeModel = employeeModel;
        this.view = view;
    }
    /***
     * Important method: uses the EmployeeDashBoardView object named "view" to access its class'
     * printEmployeeInformation()method and passes the instance variable of type Employee named "employeeModel"
     */
    public void updateDashboardView(){
        view.printEmployeeInformation(employeeModel);
    }
    /***
     *
     * @param name is a String to be passed into the setFirstName() method from the Employee class.
     * @param lastName is a String to be passed into the setLastName() method from the Employee class.
     */
    public void setEmployee(String name, String lastName){
        employeeModel.setFirstName(name);
        employeeModel.setLastName(lastName);
    }
    /*
    //returns an employee object reference, but does nothing to initialize it.
    public Employee getEmployeeModel() {
        return employeeModel;
    }*/

    public String getEmployeeName(){
        return employeeModel.getFirstName() + " " + employeeModel.getLastName();
    }
    /*
    //Does nothing
    public void setEmployeeModel(Employee employeeModel) {
        this.employeeModel = employeeModel;
    }*/

    public void setSsN(String ssn){
        employeeModel.setSsNumber(ssn);
    }
    /*
    public EmployeeDashboardView getView() {
        return view;
    }*/

    public String getSsN(){
        return employeeModel.getSsNumber();
    }
    /*
    public void setView(EmployeeDashboardView view) {
        this.view = view;
    }*/
}
