import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1.Hình chữ nhật");
            System.out.println("2.Hình tam giác vuông");
            System.out.println("3.Tam giác cân");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1; i < 5; i++) {
                        for (int j = 1; j < 10; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("  *  ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j <= 7; j++) {
                            if (!((i == 1 && (j == 1 || j == 4 || j == 7))
                                    || (i == 4 && (j == 1 || j == 7))
                                    || (i == 5 && (j == 1 || j == 2 || j == 6 || j == 7))
                                    || (i == 6 && (j == 1 || j == 3 || j == 2 || j == 5 || j == 6 || j == 7)))) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");
                            }

                        }
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        }

    }
}
