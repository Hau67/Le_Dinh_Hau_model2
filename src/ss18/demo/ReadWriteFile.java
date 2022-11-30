package ss18.demo;

import ss17.Read_Writer.ReadFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeFile(String pathFile,String line){

        try {
            FileWriter fileWriter = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<String> readFile(String pathFile) {
        List<String> listline = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                listline.add(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listline;
    }
}
