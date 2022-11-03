import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        int[] arr3 = new int[11];
        int i = 0;
        int j = 0;
        Scanner sc = new Scanner(System.in);
        while (i < arr1.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " :");
            arr1[i] = sc.nextInt();
            i++;
        }
        System.out.print("Mảng ban đầu arr1:");
        for (int k : arr1) {
            System.out.print(k + "\t");
        }
        System.out.println("------------");


        while (j < arr2.length) {
            System.out.print("Nhập phần tử thứ " + (j + 1) + " :");
            arr2[j] = sc.nextInt();
            j++;
        }
        System.out.print("Mảng ban đầu arr2:");
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + "\t");
        }

        for (int l = 0; l < arr3.length; l++) {
            if (l < arr1.length) {
                arr3[l] = arr1[l];
            }
            else if (l >= arr1.length)
                arr3[l] = arr2[l -arr1.length];

        }
        System.out.print("Mảng arr3:");
        for (int k = 0; k < arr3.length; k++) {

            System.out.print(arr3[k] + "\t");
        }


    }
}
