import java.util.Scanner;

public class KiemTraSNT {
    public static void main(String[] args) {
        System.out.println("Kiểm tra số nguyên tố:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println(" không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i < num) {
                if (num % i == 0) {
                    check = false;
                }
                i++;
            }
            if (check) {
                System.out.println(num + " là số nguyên tố");
            } else {
                System.out.println(num + " không phải là số nguyên tố");
            }
        }
    }
}
