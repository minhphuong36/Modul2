package sudung_arrlist_linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
   static ArrayList<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void show(){
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }

    public void add(Product product){
        products.add(product);
    }
    public Product creatProduct(){
        System.out.println("Nhập id của sản phầm");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên của sản phầm");
        String name = sc.nextLine();

        System.out.println("Nhập giá cua sản phẩm");
        double price = Double.parseDouble(sc.nextLine());

        return new Product(id,name,price);
    }

    public int findIndexById(int id){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public int findIndexByName(String name){
        for (int i = 0; i < products.size(); i++) {
            if (name.equals(products.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
    public void showByName(String name){
        int index = findIndexByName(name);
        System.out.println(products.get(index).toString());
    }

    public void edit(int id){
        int index = findIndexById(id);
        if(index >= 0 && index < products.size()){
            products.set(index,creatProduct());
        }
    }


    public void delete(int id){
        int index = findIndexById(id);
        if (index != -1) {
            products.remove(index);
        }
    }

}
