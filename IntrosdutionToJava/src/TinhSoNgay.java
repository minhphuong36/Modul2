import java.util.Scanner;

public class TinhSoNgay {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("which month that you want display to count day!");
        int month = day.nextInt();

        switch (month){
            case 2:
                System.out.println("The month 2 has 28 or 29 day");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month " + month + " has 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month "+ month+ " 1 has 30 day");
                break;
            default:
                System.out.println("I don't know you!");
                break;
        }
    }
}
