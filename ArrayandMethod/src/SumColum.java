import java.util.Scanner;

public class SumColum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,34,45,66,67},
                {33,34,7,100,23,6},
                {31,44,17,-85,43,26},
                {13,14,47,-15,23,96}};
        System.out.println("Nhập cột muốn tính");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int nameColum = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][nameColum];
                break;

            }
        }
        System.out.println("Tông của cột đã chọn = " + sum);
    }
}
