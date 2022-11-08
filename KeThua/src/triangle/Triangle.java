package triangle;

public class Triangle {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle(){
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getChuVi(){
        if( Math.abs(this.side1-this.side2) < this.side3 && this.side3 < this.side1+this.side2){
            return this.side1 + this.side2 + this.side3;
        }else {
            return -1;
        }

    }
    public double getDienTich(){
        if( Math.abs(this.side1-this.side2) < this.side3 && this.side3 < this.side1+this.side2){
            double p = getChuVi()/2;
            return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,1,9);
        System.out.println(" Chu Vi = " + triangle.getChuVi() + " Diện Tích = " + triangle.getDienTich());
    }
}
