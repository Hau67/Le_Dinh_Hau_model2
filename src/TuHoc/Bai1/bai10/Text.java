package TuHoc.Bai1.bai10;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSV dssv = new DanhSachSV();
        int luaChon=0;
        do {
            System.out.println("Menu");
            System.out.println("1: thêm danh sách sinh viên");
            System.out.println("2: in danh sách sinh viên");
            System.out.println("3: kiểm tra danh sách có rỗng hay không");
            System.out.println("4: lấy ra số lượng sinh viên trong danh sách");
            System.out.println("5: làm rỗng danh sách sinh viên");
            System.out.println("6: kiễm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên");
            System.out.println("7: xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên");
            System.out.println("8: tìm khiếm tất cả sinh viên dưua trên Tên được nhập từ bàn phím");
            System.out.println("9: xuất ra danh sách sinh viên có điểm từ cao đén thấp");
            System.out.println("0: thoát khỏi chương trình");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("nhập mã sinh viên");
                    String maSinhVien = sc.nextLine();
                    System.out.println("nhập họ và tên");
                    String hoVaTen = sc.nextLine();
                    System.out.println("nhập năm sinh");
                    int namSinh = sc.nextInt();
                    System.out.println("nhập điểm trung bình");
                    double diemTrungBinh = sc.nextDouble();

                    QuanLySV sv = new QuanLySV(maSinhVien,hoVaTen,namSinh,diemTrungBinh);
                    dssv.themSinhVien(sv);
                    break;
                case 2:

            }


        }while (luaChon != 0);
    }
}
