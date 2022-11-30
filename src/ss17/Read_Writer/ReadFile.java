package ss17.Read_Writer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> readList(String pathFile) {
        List<String> listLine = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;


            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listLine;
    }

    public static void writeFile(String pathFile, List<String> listLine) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
             fileWriter = new FileWriter(pathFile, true);
             bufferedWriter = new BufferedWriter(fileWriter);

            for (String line : listLine) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("source");
        System.out.println(readList("src/ss17/source_file.csv"));

        System.out.println("target");
        // lay listLine cua file doc
        List<String> listLineOfRead = ReadFile.readList("src/ss17/source_file.csv");
        //writeFile("src/ss17/target_file.csv", listLineOfRead);
        System.out.println(readList("src/ss17/target_file.csv"));
    }

}
