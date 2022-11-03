import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] arr = {1,12,43,-55,120,6,90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kỳ:");
        int value = sc.nextInt();
        int[] arrNew = new int[arr.length -1];
        int index = timIndex(arr,value);
        for (int i = 0; i < arrNew.length; i++) {
            if(i < index){
               arrNew[i] = arr[i];
            }else {
                arrNew[i] = arr[i+1];
            }
            System.out.print(arrNew[i] + "\t");
        }
    }
    public static int timIndex(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            if(value == arr[i]){
                return i;
            }

        }
        return 'k';
    }
}
