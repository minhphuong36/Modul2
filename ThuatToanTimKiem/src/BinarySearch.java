import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,12,-8,77,0,-10,44,69,96,45,20,99,120};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,77));
    }

    public static int binarySearch(int[] arr,int value){
        int left = 0;
        int right = arr.length -1;
        while (left < right){
            int mid = (left + right)/2;
            if(value < arr[mid]){
                right = mid -1;
            }else if(value > arr[mid]){
                left = mid +1;
            }else {
                return  mid;
            }
        }
        return -1;
    }
}
