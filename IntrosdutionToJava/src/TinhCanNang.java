import java.util.Scanner;

public class TinhCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Enter your weight(Kg):");
        weight = scanner.nextDouble();

        System.out.println("Enter your height(m):");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);

        if(bmi < 18){
            System.out.println("Underweight");
        }else if(bmi < 25 ){
            System.out.println("Normal");
        }else if(bmi < 30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }


    }
}