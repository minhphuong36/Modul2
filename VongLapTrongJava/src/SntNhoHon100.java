public class SntNhoHon100 {
    public static void main(String[] args) {
//        int number = 100;
        for (int i = 2; i < 100; i++) {
            boolean snt = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    snt = false;
                }
            }
            if (snt == true) {
                System.out.println(i);
            }
        }
    }
}
