package caseStudy.controller;

import caseStudy.service.behind.Impl.EmployeeManagementServiceImpl;

import java.awt.*;

public class EmployeeManagementController {
    private EmployeeManagementServiceImpl employeeManagementService = new EmployeeManagementServiceImpl();

    public void deleteEmployee() {
        this.employeeManagementService.deleteEmployee();
    }

    public void editEmployee() {
        this.employeeManagementService.editEmployee();
    }

    public void addNewEmployee(){
        this.employeeManagementService.addNew();
    }

    public void displayEmployee(){
        this.employeeManagementService.displayList();
    }
}
