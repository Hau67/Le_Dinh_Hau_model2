package ss12.exercise;

import java.util.*;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    private List<Product> list = new ArrayList<>();

    public void themSP(){
        System.out.println("nhap id them");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten them");
        String ten = sc.nextLine();
        System.out.println("nhap gia them");
        double gia = Double.parseDouble(sc.nextLine());

        Product product = new Product(id,ten,gia);
        list.add(product);
    }

    public void suaSP(){
        System.out.println("nhap id muon sua");
        int idSua = Integer.parseInt(sc.nextLine());

        for (Product products: list) {
            if (products.getId() == idSua) {
                System.out.println("nhap ten sua");
                String tenSua = sc.nextLine();
                products.setName(tenSua);
                System.out.println("nhap gia sua");
                double giaSua = sc.nextDouble();
                products.setPrice(giaSua);
            }
        }
    }

    public void xoaSP(){
        System.out.println("nhap id muon xoa");
        int idXoa = Integer.parseInt(sc.nextLine());
        Product productDelete = null;

        for (Product products: list ) {
            if (products.getId() == idXoa ) {
                productDelete = products;
            }
        }

        if (productDelete != null){
            list.remove(productDelete);
        } else {
            System.out.println("Id invalid");
        }
    }

    public void timKiemSP(){
        System.out.println("nhap ID muon tim");
        int idTimKiem = Integer.parseInt(sc.nextLine());
        Product productTimKiem= null;
        for (Product products : list) {
            if (products.getId() == idTimKiem) {
                productTimKiem = products;
            }
        }
        if (productTimKiem != null) {
            System.out.println(productTimKiem);
        }else {
            System.out.println("khong tim thay id");
        }
    }
    public void sapXepSP(){
        list.sort(new ProductComparator());
    }

    public void hienThiSP(){
        for (Product products: list) {
            System.out.println(products);
        }
    }
}
