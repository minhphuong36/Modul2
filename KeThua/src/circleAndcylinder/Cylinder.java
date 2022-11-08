package circleAndcylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getTheTich(){
        return this.height*getDienTich();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height = " + height +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3,"black",9);
        System.out.println(cylinder.toString() + " Chu vi = " + cylinder.getChuVi() +
                     " Diện Tích = " + cylinder.getDienTich() + " Thể tích = " + cylinder.getTheTich());
    }
}
