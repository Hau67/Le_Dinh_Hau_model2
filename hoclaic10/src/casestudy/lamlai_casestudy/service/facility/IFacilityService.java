package casestudy.lamlai_casestudy.service.facility;

import casestudy.lamlai_casestudy.model.furama.Facility;
import casestudy.lamlai_casestudy.model.furama.extend.Room;
import casestudy.lamlai_casestudy.model.furama.extend.Villa;

import java.util.Map;
import java.util.Random;

public interface IFacilityService {
Map<Facility,Integer> hienThiFacility();
void themRoom(Room room);
void themVilla(Villa villa);
Map<Facility, Integer> baoTriFacility();
}
