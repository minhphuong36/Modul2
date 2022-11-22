import java.util.Scanner;

public class DeBugUngDungJava {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Có dạng 'a * x + b = 0':");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("Phương trình có nghiệm = " + solution);
        } else {
            if (b == 0) {
                System.out.print("Vô số nghiệm!");
            } else {
                System.out.print("Vô nghiệm!");
            }
        }
    }
}
