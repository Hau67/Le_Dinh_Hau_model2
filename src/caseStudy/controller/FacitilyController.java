package caseStudy.controller;

import caseStudy.model.Furama.Facitily;
import caseStudy.service.behind.Impl.FacilityServiceImpl;

public class FacitilyController {
    private FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public void displayFacility() {
        this.facilityService.displayFacility();
    }
    public void addNewFacility(Facitily f,int countOfUse){
        this.facilityService.addNewFacility(f,countOfUse);
    }
}
