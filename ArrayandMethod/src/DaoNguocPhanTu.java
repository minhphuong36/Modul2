import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước mang");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Số phần tử phải <= 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.print("Nhập phần tử " + (i+1) + ":");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Phần tử trong mảng arr:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        for (int j = 0; j < arr.length/2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 -j];
            arr[size -1 -j] = temp;
        }
        System.out.printf("\n\n%-20s%s", "Đảo ngược mảng arr: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");

        }
    }
}
