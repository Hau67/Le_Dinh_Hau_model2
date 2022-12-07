package ss17.QuanLySanPham.view;

import ss17.QuanLySanPham.controller.SanPhamController;
import ss17.QuanLySanPham.model.SanPham;
import ss17.QuanLySanPham.service.Impl.QuanLySanPhamDocGhiFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamView {
    Scanner sc = new Scanner(System.in);
    SanPhamController sanPhamController = new SanPhamController();
    public void MenuQuanLy() {
        do {
            System.out.println("Menu");
            System.out.println("1: Thêm sản phẩm");
            System.out.println("2: Hiển thị sản phẩm");
            System.out.println("3: Tìm kiếm");
            System.out.println("4: Thoát");

            int luaChon;
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    System.out.println("Thêm mã sản phẩm");
                    String mSP = sc.nextLine();
                    System.out.println("Thêm tên sản phẩm");
                    String tSP = sc.nextLine();
                    System.out.println("Thêm hãn sản phẩm");
                    String hSP = sc.nextLine();
                    System.out.println("Thêm giá sản phẩm");
                    double gia = Double.parseDouble(sc.nextLine());

                    SanPham sanPham = new SanPham(mSP, tSP, hSP, gia);
                    sanPhamController.them(sanPham);
                    break;
                case 2:
                    System.out.println("Hiển thị sản phẩm");
                    List<SanPham> list = sanPhamController.display();
                    for (SanPham sanPham1: list) {
                        System.out.println(sanPham1);
                    }
                    break;
                case 3:
                    System.out.println("Tìm kiếm");
                    System.out.println("Nhập mã sản phẩm tìm kiếm");
                    String mSPTK = sc.nextLine();

                    List<SanPham> lists = sanPhamController.display();
                    for (SanPham sanPham1: lists) {
                        if (sanPham1.getMaSanPham().equals(mSPTK)) {
                            System.out.println(sanPham1);
                        }else {
                            System.out.println("không có mã sản phẩm này");
                        }
                    }


                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Nhap k dung");
            }
        } while (true);
    }

}
