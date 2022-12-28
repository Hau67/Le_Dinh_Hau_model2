package casestudy.lamlai_casestudy.service.facility;

import casestudy.lamlai_casestudy.model.furama.extend.Room;

import java.util.Map;

public interface IRoomServiceIO {
    Map<Room,Integer> readFile(String path);
    void writeFile(String path,Map<Room,Integer> map);
}
