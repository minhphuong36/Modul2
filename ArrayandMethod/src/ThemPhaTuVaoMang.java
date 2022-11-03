import java.util.Scanner;

public class ThemPhaTuVaoMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng (<=20) ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Độ dài mảng phải <= 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập các phần tử  " + i + " :");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Phần tử trong mảng arr:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        int[] arrNew = new int[arr.length + 1];
        System.out.println("Nhập giá trị bất kỳ");
        int x = sc.nextInt();

        System.out.println("Nhập vị trí bât kỳ");
        int index = sc.nextInt();

        for (int j = 0; j < arrNew.length ; j++) {
            if (j < index) {
                arrNew[j] = arr[j];
            } else if (index == j) {
                arrNew[index] = x;
            } else if (j > index) {
                arrNew[j] = arr[j - 1];
            }
        }
        for (int j = 0; j < arrNew.length; j++) {
            System.out.print(arrNew[j] + "\t");

        }
    }
}
