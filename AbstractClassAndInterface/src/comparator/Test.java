package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.5);
        circles[1] = new Circle();
        circles[2] = new Circle("blue",true,3.7);

        System.out.println("trước khi so sánh");
        for (Circle circle: circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("Sau khi so sánh");
        for (Circle circle: circles) {
            System.out.println(circle);
        }
    }
}
