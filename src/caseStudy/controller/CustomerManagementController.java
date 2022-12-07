package caseStudy.controller;

import caseStudy.service.behind.Impl.CustomerManagementServiceImpl;

public class CustomerManagementController {
    private CustomerManagementServiceImpl customerManagementService = new CustomerManagementServiceImpl();

    public void editEmployees(){
        this.customerManagementService.editEmployee();
    }

    public void addNews(){
        this.customerManagementService.addNew();
    }

    public void displayList(){
        this.customerManagementService.displayList();
    }
}
