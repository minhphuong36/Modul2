import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        String chuoi = "asdkglassdaldksdasdasacas";
        int count = 0;
        char kyTu = 'a';
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập vào ky tu bất kỳ: ");
//        kyTu = scanner.nextLine();

        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if ( kyTu ==  chuoi.charAt(i)) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + chuoi + " = " + count);
    }
}
