package casestudy.lamlai_casestudy.view;

import casestudy.lamlai_casestudy.controller.FacilityController;
import casestudy.lamlai_casestudy.model.furama.extend.Room;
import casestudy.lamlai_casestudy.model.furama.extend.Villa;

import java.util.Scanner;

public class MenuFacility {
    Scanner sc = new Scanner(System.in);
    FacilityController facilityController = new FacilityController();
    public void displayFacility(){
        do {
            System.out.println("1. hiển thị Facility");
            System.out.println("2. thêm Facility");
            System.out.println("3. hiển thị cần bảo trì Facility");
            System.out.println("4. menu chính");
            System.out.println("-------------");
            System.out.println("chọn số");
            int num = Integer.parseInt(sc.nextLine());
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
                        int number = Integer.parseInt(sc.nextLine());

                        switch (number) {
                            case 1:
                                System.out.println("thêm tên dịch vụ");
                                String tenDVV = sc.nextLine();
                                System.out.println("thêm diện tích sử dụng");
                                String dienTSDV = sc.nextLine();
                                System.out.println("thêm chi phí thuê");
                                String chiPTV = sc.nextLine();
                                System.out.println("thêm số lượng người tối đa");
                                String soLNTDV = sc.nextLine();
                                System.out.println("thêm kiểu thuê ");
                                String kieuThueV = sc.nextLine();
                                System.out.println("thêm tiêu chuẩn phòng");
                                String tieuCPV = sc.nextLine();
                                System.out.println("thêm diện tích hồ bơi");
                                String dienTHBV = sc.nextLine();

                                Villa villa = new Villa(tenDVV,dienTSDV,chiPTV,soLNTDV,kieuThueV,tieuCPV,dienTHBV);
                                facilityController.themVilla(villa);
                                break;
                            case 2:
                                System.out.println("thêm tên dịch vụ");
                                String tenDV = sc.nextLine();
                                System.out.println("thêm diện tích sử dụng");
                                String dienTichSD = sc.nextLine();
                                System.out.println("thêm chi phí thuế");
                                String chiPT = sc.nextLine();
                                System.out.println("thêm số lượng người tối đa");
                                String soLNTD = sc.nextLine();
                                System.out.println("thêm kiểu thuế");
                                String kieuThue = sc.nextLine();
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
