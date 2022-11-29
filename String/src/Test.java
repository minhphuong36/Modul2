import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$");
        while (true) {
            System.out.println("Nhập chuỗi");
            String txt = sc.nextLine();
            if (p.matcher(txt).find()) {
                System.out.println("ok");
                break;
            } else {
                System.out.println("Not ok");
            }
        }
    }
}
