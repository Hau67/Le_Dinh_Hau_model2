package ss18.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public  static final String FILE_NAME = "src/ss18/writeFile";
    public  static  final String COMMA = ",";

    public static void main(String[] args) {
        QuanLy quanLy1= new QuanLy("1","dau goi","vn",2000);
        QuanLy quanLy2= new QuanLy("2","thuoc","vn",5000);
        QuanLy quanLy3= new QuanLy("3","dao","vn",1000);

        List<QuanLy> quanLyList= new ArrayList<>();
        quanLyList.add(quanLy1);
        quanLyList.add(quanLy2);
        quanLyList.add(quanLy3);

        String line;
        for (QuanLy quanLy:quanLyList) {
            line = quanLy.getMaSanPham() + COMMA + quanLy.getTenSanPham() + COMMA + quanLy.getHangSanXuat() + COMMA + quanLy.getGia();
            ReadWriteFile.writeFile(FILE_NAME,line);
        }

        List<String> listline = ReadWriteFile.readFile(FILE_NAME);
        System.out.println(listline);
    }
}
