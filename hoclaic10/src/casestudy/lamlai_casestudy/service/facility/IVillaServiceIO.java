package casestudy.lamlai_casestudy.service.facility;

import casestudy.lamlai_casestudy.model.furama.extend.Villa;

import java.util.Map;

public interface IVillaServiceIO {
    Map<Villa,Integer> readFile(String path);
    void writeFile(String path,Map<Villa,Integer> mapVilla);
}
