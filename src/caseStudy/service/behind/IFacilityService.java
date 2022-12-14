package caseStudy.service.behind;

import caseStudy.model.Furama.Facitily;

public interface IFacilityService<O> {
    void displayFacility();
    void addNewFacility(Facitily f,int countOfUse);
    void displayMaintenance(Facitily O);
}
