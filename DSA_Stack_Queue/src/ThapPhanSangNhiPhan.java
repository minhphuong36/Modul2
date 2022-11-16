import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Stack<Integer>  stackSoDu = new Stack<>();
        System.out.println("Nhập 1 số nguyên bất kỳ");
        Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
        while (x > 0){
            int soDu = x % 2;
            stackSoDu.push(soDu);
            x = x/2;
        }
        System.out.println("Số nhị phân là");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackSoDu.pop() + "\t");

        }
    }
}
