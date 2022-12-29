package casestudy.lamlai_casestudy.service.facility.impl;

import casestudy.lamlai_casestudy.model.furama.Facility;
import casestudy.lamlai_casestudy.model.furama.extend.Room;
import casestudy.lamlai_casestudy.model.furama.extend.Villa;
import casestudy.lamlai_casestudy.service.facility.IFacilityService;
import casestudy.lamlai_casestudy.service.facility.IRoomServiceIO;
import casestudy.lamlai_casestudy.service.facility.IVillaServiceIO;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService implements IFacilityService {
private final IRoomServiceIO iRoomServiceIO = new RoomServiceIO();
private final IVillaServiceIO iVillaServiceIO = new VillaServiceIO();
private static   final Map<Facility,Integer> facilityMap = new LinkedHashMap<>();
public static final String PATH_ROOM = "src/casestudy/lamlai_casestudy/data/room_file.csv";
public static final String PATH_VILLA = "src/casestudy/lamlai_casestudy/data/villa_file.csv";
    @Override
    public Map<Facility, Integer> hienThiFacility() {
        Map<Room,Integer> roomMap =this.iRoomServiceIO.readFile(PATH_ROOM);
        Map<Villa,Integer> villaMap = this.iVillaServiceIO.readFile(PATH_VILLA);
        facilityMap.putAll(roomMap);
        facilityMap.putAll(villaMap);
        for (Map.Entry<Room,Integer> entry : roomMap.entrySet()){
            System.out.println(entry);
        }
        for (Map.Entry<Villa, Integer> entry1: villaMap.entrySet()){
            System.out.println(entry1);

        }



        return facilityMap;

    }

    @Override
    public void themRoom(Room room) {
    Map<Room,Integer> roomMap = this.iRoomServiceIO.readFile(PATH_ROOM);
    roomMap.put(room,0);
    this.iRoomServiceIO.writeFile(PATH_ROOM,roomMap);

    }

    @Override
    public void themVilla(Villa villa) {
        Map<Villa,Integer> villaMap = this.iVillaServiceIO.readFile(PATH_VILLA);
        villaMap.put(villa,0);
        this.iVillaServiceIO.writeFile(PATH_VILLA,villaMap);

    }

    @Override
    public Map<Facility, Integer> baoTriFacility() {
        return null;
    }

}
