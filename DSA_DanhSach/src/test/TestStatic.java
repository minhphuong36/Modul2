package test;

import java.util.Arrays;

public class TestStatic {
    public static void main(String[] args) {
      String a = "hello các bạn, mình là phương. Mình là lập trình viên";
      String s1 = "Mai Minh Phương";
      String[] c = s1.split(" ");
        System.out.println(Arrays.toString(c));
        System.out.println("Tên: " + c[c.length-1]);


//      String[] b = a.split("\\.|\\,| ");
//        System.out.println(Arrays.toString(b));
    }
}
