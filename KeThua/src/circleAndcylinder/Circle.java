package circleAndcylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDienTich(){
        return Math.PI*this.radius*this.radius;
    }

    public  double getChuVi(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7,"red");
        circle.setRadius(9);
        circle.setColor("red");
        System.out.println(circle.toString() + " Diện Tích = " + circle.getDienTich() + " Chu Vi = " + circle.getChuVi());
    }
}
