import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f, c;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập độ F:");
                    f = input.nextDouble();
                    System.out.println("F to C:  " + FtoC(f));
                    break;

                case 2:
                    System.out.println("Nhập độ C:");
                    c = input.nextDouble();
                    System.out.println("C to F:  " + CtoF(c));
                    break;

                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double CtoF(double c) {
        double f = (9 / 5) * c + 32;
        return f;
    }

    public static double FtoC(double f) {
        double c = (5 / 9) * (f - 32);
        return c;
    }
}
