public class HienthiSNT {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 2; count < 20; a++) {
            boolean snt = true;
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    snt = false;
                }
            }
            if (snt == true) {
                count++;
                System.out.println(a);
            }
        }
    }
}
