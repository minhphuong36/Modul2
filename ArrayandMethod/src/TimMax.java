import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số các tỷ phú cần so sánh ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Số các tỷ phú phải <= 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập số tiền (đơn vị: tỷ USD) " + (i + 1) + " :");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Số tiền của các tỷ phú:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int max = 0;
        int vitri = 0;
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == max) {
                vitri = j;
                System.out.println("Giá trị tài sản Max = " + max + " vị trí " + vitri);
            }
        }

    }
}

