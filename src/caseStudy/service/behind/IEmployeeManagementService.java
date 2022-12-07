package caseStudy.service.behind;

import caseStudy.service.IManagementServise;

public interface IEmployeeManagementService extends IManagementServise {
    void deleteEmployee();
    void editEmployee();
}
