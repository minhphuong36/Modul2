public class TimMinuseMethod {

    public static void main(String[] args) {
        int[] arr = {1,22,54,22,-5,7,-10,34,98};
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất có giá trị :" + arr[index]);

    }
    public static int minValue(int[] arr){
        int index = 0;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < arr[index]){
                index = i;
            }
        }
        return index;
    }
}
