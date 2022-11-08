import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;

    public GiaiPhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public double getDelta(){
        return this.b*this.b - 4*this.a*this.c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        double a = sc.nextDouble();
        System.out.println("Nhap b");
        double b = sc.nextDouble();
        System.out.println("Nhap c");
        double c = sc.nextDouble();

        GiaiPhuongTrinhBac2 ptb2 = new GiaiPhuongTrinhBac2(a,b,c);
        if(ptb2.getA() == 0){
            System.out.println("Giai phuong trinh bac nhat");
        }else {
            if(ptb2.getDelta() < 0){
                System.out.println("Phuong trinh vo nghiem");
            }else if(ptb2.getDelta() == 0){
                System.out.println("Phuong trinh co nghiem x1 = x2 = " + (-ptb2.getB() + Math.pow(ptb2.getDelta(),0.5))/(2* ptb2.getA()));
            }else{
                System.out.println("Phuong trinh co 2 nghiem x1 ="+ (-ptb2.getB() + Math.pow(ptb2.getDelta(),0.5))/(2* ptb2.getA()) + " x2 = " + (-ptb2.getB() - Math.pow(ptb2.getDelta(),0.5))/(2* ptb2.getA()));
            }
        }


    }


}
