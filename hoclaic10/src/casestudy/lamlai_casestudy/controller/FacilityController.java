package casestudy.lamlai_casestudy.controller;

import casestudy.lamlai_casestudy.model.furama.Facility;
import casestudy.lamlai_casestudy.model.furama.extend.Room;
import casestudy.lamlai_casestudy.model.furama.extend.Villa;
import casestudy.lamlai_casestudy.service.facility.impl.FacilityService;

import java.util.Map;

public class FacilityController {
    FacilityService facilityService = new FacilityService();

    public void hienThiFacility(){
         this.facilityService.hienThiFacility();
    }

    public void themRoom(Room room){
        this.facilityService.themRoom(room);
    }

    public void themVilla(Villa villa){
        this.facilityService.themVilla(villa);
    }

    public void baoTriFacility(){
        this.facilityService.baoTriFacility();
    }
}
