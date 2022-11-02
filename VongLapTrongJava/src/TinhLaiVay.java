import java.util.Scanner;

public class TinhLaiVay {
    public static void main(String[] args) {
        System.out.println("TÍNH LÃI SUẤT CHO VAY");
        double tienGoc,laiVay,soThang;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số tiền gốc");
        tienGoc = sc.nextDouble();
        System.out.println("Nhập lãi suất cho vay(% theo năm)");
        laiVay = sc.nextDouble();
        System.out.println("Nhập số tháng cho vay");
        soThang = sc.nextDouble();

        double money = tienGoc*Math.pow((1+ (laiVay*0.01)/12 ),soThang);
        System.out.println("Tổng tiền nhận được = " + money);


    }
}
