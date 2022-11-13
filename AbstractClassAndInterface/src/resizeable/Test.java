package resizeable;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        double percent = 20;
        System.out.println("S truoc khi thay doi : "+ circle.getArea());
        circle.resize(percent);
        System.out.println("S sau khi thay doi : "+ circle.getArea());

        System.out.println("=================");
        Rectangle rectangle = new Rectangle(10,20);
        double percent1 = 20;
        System.out.println("S truoc khi thay doi : "+ rectangle.getArea());
        rectangle.resize(percent1);
        System.out.println("S sau khi thay doi : "+ rectangle.getArea());

    }
}
