package casestudy.lamlai_casestudy.service.facility;

import casestudy.lamlai_casestudy.model.furama.Facility;
import casestudy.lamlai_casestudy.model.furama.extend.Room;
import casestudy.lamlai_casestudy.model.furama.extend.Villa;

import java.util.Map;

public interface IFacilityService {
void hienThiFacility();
void themRoom(Room room);
void themVilla(Villa villa);
void baoTriFacility();
}
