package hinhhoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.7,8);
        System.out.println(rectangle);

        rectangle = new Rectangle("blue",true,6,5);
        System.out.println(rectangle);
    }
}
