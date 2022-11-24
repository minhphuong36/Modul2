package managerproduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("001", "Iphone13", "Apple", 12.5);
        Product p2 = new Product("003", "GalaxyS7", "SamSung", 15);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        try {
            FileOutputStream fo = new FileOutputStream("data.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            for(Product o: products){
                oos.writeObject(o.toString());
            }


            FileInputStream fi = new FileInputStream("data.bin");
            ObjectInputStream ois = new ObjectInputStream(fi);
            String line = "";
            while (true){
                line = (String) ois.readObject();
                if(line == null){
                    break;
                }

                System.out.println(line);
            }
        } catch (IOException e) {
//            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

