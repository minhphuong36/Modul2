import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        int a, b;
        int ucln = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số a:");
        a = sc.nextInt();

        System.out.println("Nhập số b:");
        b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("không tìm được UCLN");
        } else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    if(i > ucln){
                        ucln = i;
                    }
                }

            }
            System.out.println("Ước Chung Lon Nhất của a,b là " + ucln);

        }
    }
}
