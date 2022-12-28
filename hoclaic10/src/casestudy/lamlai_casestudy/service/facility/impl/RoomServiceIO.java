package casestudy.lamlai_casestudy.service.facility.impl;

import casestudy.lamlai_casestudy.model.furama.extend.Room;
import casestudy.lamlai_casestudy.service.facility.IRoomServiceIO;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RoomServiceIO implements IRoomServiceIO {
    @Override
    public Map<Room, Integer> readFile(String path) {
        Map<Room,Integer> map = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine())!= null){
                String[] ro = line.split(",");
                Room room = new Room(ro[0],ro[1],ro[2],ro[3],ro[4],ro[5]);
                map.put(room,Integer.parseInt(ro[6]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return map;
    }

    @Override
    public void writeFile(String path, Map<Room, Integer> map) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Map.Entry<Room,Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
