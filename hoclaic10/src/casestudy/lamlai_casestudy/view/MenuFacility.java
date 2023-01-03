package casestudy.lamlai_casestudy.view;

import casestudy.lamlai_casestudy.controller.FacilityController;
import casestudy.lamlai_casestudy.model.furama.extend.Room;
import casestudy.lamlai_casestudy.model.furama.extend.Villa;
import casestudy.lamlai_casestudy.regex.Regex;

import java.util.Scanner;

public class MenuFacility {
    Scanner sc = new Scanner(System.in);
    FacilityController facilityController = new FacilityController();

    public void displayFacility(){
        do {
            System.out.println("1. hiển thị cơ sở");
            System.out.println("2. thêm cơ sở");
            System.out.println("3. hiển thị cần bảo trì cơ sở");
            System.out.println("4. về trang chính");
            System.out.println("-------------");
            System.out.println("chọn số");
            int num;
            try {
                num = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                continue;
            }
            switch (num){
                case 1:
                    facilityController.hienThiFacility();
                    break;
                case 2:
                    do {
                        System.out.println("1.thêm villa");
                        System.out.println("2. thêm room");
                        System.out.println("3. về trang chính");
                        System.out.println("chọn số");
                        int number;
                        try {
                            number = Integer.parseInt(sc.nextLine());
                        }catch (NumberFormatException e){
                            System.out.println(e.getMessage());
                            continue;
                        }

                        switch (number) {
                            case 1:
                                String tenDVV;
                                boolean kiemTraTDVV = false;
                                do {
                                    System.out.println("thêm tên dịch vụ");
                                    tenDVV = sc.nextLine();
                                    if (Regex.tenDichVu(tenDVV)){
                                        break;
                                    }else {
                                        System.out.println("nhập sai mời nhập lại");
                                        kiemTraTDVV = true;
                                    }
                                }while (kiemTraTDVV);

                                String dienTSDV;
                                boolean kiemTraDienTSDV = false;
                                do {
                                    System.out.println("thêm diện tích sử dụng");
                                    dienTSDV = sc.nextLine();
                                    if (Regex.DienTich(dienTSDV)){
                                        break;
                                    }else {
                                        System.out.println("nhập sai mời nhập lại");
                                        kiemTraDienTSDV = true;
                                    }
                                }while (kiemTraDienTSDV);

                                String chiPTV;
                                boolean kiemTraChiPTV = false;
                                do {
                                    System.out.println("thêm chi phí thuê");
                                    chiPTV = sc.nextLine();
                                    if (Regex.chiPhiThue(chiPTV)){
                                        break;
                                    }else {
                                        System.out.println("nhập sai mời nhập lại");
                                        kiemTraChiPTV = true;
                                    }
                                }while (true);

                                String soLNTDV;
                                boolean kiemTraSoLNTDV = false;
                                do {
                                    System.out.println("thêm số lượng người tối đa");
                                    soLNTDV = sc.nextLine();
                                    if (Regex.soLuongNguoi(soLNTDV)){
                                        break;
                                    }else {
                                        System.out.println("nhập sai mời nhập lại");
                                        kiemTraSoLNTDV = true;
                                    }
                                }while (kiemTraSoLNTDV);

                                String kieuThueV;
                                boolean kiemTraKieuThueV = false;
                                do {
                                    System.out.println("thêm kiểu thuê ");
                                    kieuThueV = sc.nextLine();
                                    if (Regex.kieuThue(kieuThueV)){
                                        break;
                                    }else {
                                        System.out.println("nhập sai mời nhập lại");
                                        kiemTraKieuThueV = true;
                                    }
                                }while (kiemTraKieuThueV);

                                String tieuCPV;
                                boolean kiemTraTCP = false;
                                do {
                                    System.out.println("thêm tiêu chuẩn phòng");
                                    tieuCPV = sc.nextLine();
                                    if (Regex.kieuThue(tieuCPV)){
                                        break;
                                    }else {
                                        System.out.println("nhập sai mời nhập lại");
                                        kiemTraTCP = true;
                                    }
                                }while (kiemTraTCP);

                                String dienTHBV;
                                boolean kiemTraDienTHBV = false;
                                do {
                                    System.out.println("thêm diện tích hồ bơi");
                                    dienTHBV = sc.nextLine();
                                    if (Regex.DienTich(dienTHBV)){
                                        break;
                                    }else {
                                        System.out.println("nhập sai mời nhập lại");
                                        kiemTraDienTHBV = true;
                                    }
                                }while (kiemTraDienTHBV);


                                Villa villa = new Villa(tenDVV,dienTSDV,chiPTV,soLNTDV,kieuThueV,tieuCPV,dienTHBV);
                                System.out.println(villa);
                                facilityController.themVilla(villa);
                                break;
                            case 2:
                                String tenDV;
                                boolean kiemTraTenDV = false;
                                do {
                                    System.out.println("thêm tên dịch vụ");
                                    tenDV = sc.nextLine();
                                    if (Regex.tenDichVu(tenDV)){
                                        break;
                                    }else {
                                        System.out.println(" nhập sai mời nhập lại");
                                        kiemTraTenDV = true;
                                    }
                                }while (kiemTraTenDV);

                                String  dienTichSD;
                                boolean kiemTraDienTichSD= false;
                                do {
                                    System.out.println("thêm diện tích sử dụng");
                                    dienTichSD = sc.nextLine();
                                    if (Regex.DienTich(dienTichSD)){
                                        break;
                                    }else {
                                        System.out.println("nhập sai mời nhập lại");
                                        kiemTraDienTichSD = true;
                                    }
                                }while (kiemTraDienTichSD);

                                String chiPT;
                                boolean kiemTraChiPT = false;
                                do {
                                    System.out.println("thêm chi phí thuê");
                                    chiPT = sc.nextLine();
                                    if (Regex.chiPhiThue(chiPT)){
                                        break;
                                    }else {
                                        System.out.println("nhập sai mời nhập lại");
                                        kiemTraChiPT = true;
                                    }
                                }while (kiemTraChiPT);

                                String soLNTD;
                                boolean kiemTraSoLNTD = false;
                                do {
                                    System.out.println("thêm số lượng người tối đa");
                                    soLNTD = sc.nextLine();
                                    if (Regex.soLuongNguoi(soLNTD)){
                                        break;
                                    }else {
                                        System.out.println("nhập sai mời nhập lại");
                                        kiemTraSoLNTD = true;
                                    }
                                }while (kiemTraSoLNTD);

                                String kieuThue;
                                boolean kiemTraKieuThue = false;
                                do {
                                    System.out.println("thêm kiểu thuế");
                                    kieuThue = sc.nextLine();
                                    if (Regex.kieuThue(kieuThue)){
                                        break;
                                    }else {
                                        System.out.println("nhập sai mời nhập lại");
                                        kiemTraKieuThue = true;
                                    }
                                }while (kiemTraKieuThue);

                                System.out.println("thêm dịch vụ miễn phí đi kèm");
                                String dichVMPDK = sc.nextLine();
                                Room room = new Room(tenDV,dienTichSD,chiPT,soLNTD,kieuThue,dichVMPDK);
                                System.out.println(room);
                                facilityController.themRoom(room);
                                break;
                            case 3:
                                return;
                            default:
                                System.out.println("chọn sai mời nhập lại");
                        }
                    }while (true);

                case 3:
                    this.facilityController.baoTriFacility();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("nhập sai mời nhập lại");
            }
        }while (true);
    }
}
