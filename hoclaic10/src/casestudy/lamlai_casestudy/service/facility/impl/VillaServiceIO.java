package casestudy.lamlai_casestudy.service.facility.impl;

import casestudy.lamlai_casestudy.model.furama.extend.Villa;
import casestudy.lamlai_casestudy.service.facility.IVillaServiceIO;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class VillaServiceIO implements IVillaServiceIO {
    @Override
    public Map<Villa, Integer> readFile(String path) {
        Map<Villa,Integer> map = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] vi = line.split(",");
                Villa villa = new Villa(vi[0],vi[1],vi[2],vi[3],vi[4],vi[5],vi[6]);
                map.put(villa,Integer.parseInt(vi[7]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public void writeFile(String path, Map<Villa, Integer> mapVilla) {
        FileWriter fileWriter= null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Map.Entry<Villa,Integer> entry : mapVilla.entrySet()) {
                bufferedWriter.write(entry.getKey().khuonMauVillaCSV()+","+entry.getValue());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
           e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
