import java.util.Scanner;

public class PTbacNhat {
    public static void main(String[] args) {
        System.out.println("Giai PT dang: ax +b = 0");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        double a = scanner.nextDouble();

        System.out.println("Enter b:");
        double b = scanner.nextDouble();

        if( a == 0){
            if( b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }

        }else {
            double answer = -b/a;
            System.out.println("Phuong trinh co nghiem x =" + answer);
        }
    }
}
