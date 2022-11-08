import java.util.Scanner;

public class HinhChuNhat {
    double width;
    double height;

    public HinhChuNhat(){
    };

    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getDienTich(){
        return this.width*this.height;
    }
    public double getChuVi(){
        return (this.width + this.height)*2;
    }

    public String display(){
        return " kich thuoc: {" + "  width = " + width + "  height = " + height + "}";
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong (width)");
        double width = sc.nextDouble();
        System.out.println("Nhap chieu dai (height)");
        double height = sc.nextDouble();

        HinhChuNhat hcn = new HinhChuNhat(width,height);
        System.out.println("Hinh Chu Nhat " + hcn.display());
        System.out.println("Dien tich hinh chu nhat: " + hcn.getDienTich());
        System.out.println("Chu vi hinh chu nhat: " + hcn.getChuVi());

    }
}
