public class TongDuongCheoChinh {
    public static void main(String[] args) {
        int[][] arr = {{1,2,34,45,66,67},
                       {33,34,7,100,23,6},
                       {31,44,17,-85,43,26},
                       {13,14,47,-15,2,91},
                       {3,4,-47,-15,13,56},
                       {73,24,47,-15,-3,46},};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    sum += arr[i][j];
                }

            }

        }
        System.out.println("Tổng đường chéo chính = " + sum);
    }
}
