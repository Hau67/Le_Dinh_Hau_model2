package caseStudy.service.behind.Impl;

import caseStudy.model.Furama.Facitily;
import caseStudy.service.behind.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {
    LinkedHashMap<Facitily,Integer> linkedHashMap = new LinkedHashMap<>();
    @Override
    public void displayFacility() {
        for (Map.Entry<Facitily,Integer> entry: linkedHashMap.entrySet()) {
            System.out.println(entry);
        }
    }

    @Override
    public void addNewFacility(Facitily f,int countOfUse) {
        linkedHashMap.put(f,countOfUse);
    }

    @Override
    public void displayMaintenance(Facitily O) {

    }
}
