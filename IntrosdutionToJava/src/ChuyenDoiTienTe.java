import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd, usd;
        System.out.println("Nhập số tiền cần chuyển đổi (usd)");
        Scanner scanner = new Scanner(System.in);
        usd = scanner.nextDouble();
        vnd = usd*23000;
        System.out.println("Số tiền đổi được là: " + vnd);
    }
}
