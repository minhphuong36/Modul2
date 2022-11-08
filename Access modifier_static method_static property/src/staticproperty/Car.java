package staticproperty;

public class Car {
    public static String name;
    public static String engine;

    public static int numberOfCars;
     public Car(String name, String engine){
         this.name = name;
         this.engine = engine;
         numberOfCars++;
     }
}
