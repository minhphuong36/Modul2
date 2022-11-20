package sudung_arrlist_linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();

        while (true) {
            System.out.println("Quan ly san pham");
            System.out.println("1.Thêm sản phẩm ");
            System.out.println("2.Sửa sản phẩm theo id");
            System.out.println("3.Xoa san pham theo id");
            System.out.println("4.Hiển thị san pham");
            System.out.println("5.Tìm kiếm san pham theo tên");
            System.out.println("6.Sắp xếp theo giá tăng/giam của sản phẩm");
            System.out.println("7.Thoát khỏi chương trình");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Product product = manager.creatProduct();
                    manager.add(product);
                    break;
                case 2:
                    System.out.println("Nhập id  muốn sửa");
                    int id = Integer.parseInt(sc.nextLine());
                    manager.edit(id);
                    break;
                case 3:
                    System.out.println("Nhập id muốn xóa");
                    int idDelete = Integer.parseInt(sc.nextLine());
                    manager.delete(idDelete);
                    break;
                case 4:
                    manager.show();
                    break;

                case 5:
                    System.out.println("Nhập tên sản phẩm cần tìm");
                    String name = sc.nextLine();
                    System.out.println("Thông tin sản phẩm: ");
                    manager.showByName(name);
                    break;
                case 6:
                    System.out.println("1.sắp xếp theo giá tăng");
                    System.out.println("2.sắp xếp theo giá giảm");
                    int chon = Integer.parseInt(sc.nextLine());
                    switch (chon){
                        case 1:
                            Collections.sort(Manager.products, new SortUpByPrice());
                            for (int i = 0; i < Manager.products.size() ; i++) {
                                System.out.println(Manager.products.get(i).toString());
                            }
                            break;
                        case 2:
                            Collections.sort(Manager.products, new SortDownByPrice());
                            for (int i = 0; i < Manager.products.size() ; i++) {
                                System.out.println(Manager.products.get(i).toString());

                            }
                            break;
                        default:
                            System.exit(0);
                    }

                    break;
                case 7:
                    System.exit(0);
                    break;


            }
        }

    }
}
