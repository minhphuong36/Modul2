import java.util.Scanner;

public class Practive {
    public static void main(String[] args) {
//        Kiểm tra số chia hết cho 3:
//        System.out.println("Nhập n từ bàn phím:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i < n; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Số chia hết cho 3 bé hơn n: " + i);
//            }
//
//        }

//        Kiểm tra số nguyên tố đén khi nhập vào số 0
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số bất kỳ");
            n = sc.nextInt();
            if (n < 2) {
                System.out.println(" không phải là số nguyên tố");
            } else {
                int i = 2;
                boolean check = true;
                while (i < n) {
                    if (n % i == 0) {
                        check = false;
                    }
                    i++;
                }
                if (check) {
                    System.out.println(n + " là số nguyên tố");
                } else {
                    System.out.println(n + " không phải là số nguyên tố");
                }
            }


        }while (n != 0);
    }
}