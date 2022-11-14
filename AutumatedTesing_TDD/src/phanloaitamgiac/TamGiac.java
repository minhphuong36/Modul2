package phanloaitamgiac;

public class TamGiac {
    public static boolean isTonTaiTamGiac(double a, double b, double c) {
        if ((Math.abs(a - b) < c && c < (a + b))) {
            return true;
        } else{
            return false;
        }
    }


    public static boolean isTamGiacDeu(double a, double b, double c) {
        boolean delta = isTonTaiTamGiac(a, b, c);
        if (delta) {
            if (a == b && a == c) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }

    public static boolean isTamGiacCan(double a, double b, double c) {
        boolean delta = isTonTaiTamGiac(a, b, c);
        if (delta) {
            if (a == b || a == c || b == c) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }

    }


}
