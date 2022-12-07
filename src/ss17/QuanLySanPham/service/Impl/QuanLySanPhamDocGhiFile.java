package ss17.QuanLySanPham.service.Impl;

import ss17.QuanLySanPham.model.SanPham;
import ss17.QuanLySanPham.service.IDocGhiFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuanLySanPhamDocGhiFile implements IDocGhiFile {
    @Override
    public List<SanPham> readFile(String path) {
        List<SanPham> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                SanPham sanPham = new SanPham(array);
                list.add(sanPham);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }

    @Override
    public void writeFile(String path, List<SanPham> sanPham) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (SanPham sanPhams : sanPham ) {
                bufferedWriter.write(sanPhams.khuonMauCSV());
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
