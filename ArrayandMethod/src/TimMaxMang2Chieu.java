public class TimMaxMang2Chieu {
    public static void main(String[] args) {
        int[][] arr = {{1,2,34,45,66,67},
                       {33,34,7,100,23,6},
                       {31,44,17,-85,43,26},
                       {13,14,47,-15,23,96}};
        int max = arr[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                    x = i;
                    y = j;
                }

            }

        }
        System.out.println("max = " + max + " x = " + x + " y = "+ y);
    }
//    public static timIndex(int[][] arr,int x,int y){
//        int max = arr[0][0];
//        for (int i = 0; i < arr.length; i++) {
//            if(max < arr[x][y]){
//                max = arr[x][y];
//                return x,y;
//            }
//        }
//        return -1;
//    }
}
