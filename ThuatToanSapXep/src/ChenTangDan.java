import java.util.Arrays;

public class ChenTangDan {
    public static void main(String[] args) {
        int[] arr = {12,30,-90,7,20,45,70,33,10,0};
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int j;
            for ( j = i -1 ; j >= 0 && arr[j] > value; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = value;

            }
        System.out.println(Arrays.toString(arr));
        }


    }

