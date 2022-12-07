package caseStudy.service.behind;

import caseStudy.model.Furama.Facitily;
import caseStudy.service.IManagementServise;

public interface IFacilityManagementService extends IManagementServise<Facitily> {
    void displayListFacilityMaintenance();
}
