package staticproperty;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("BMW","1200cc");
        System.out.println(Car.numberOfCars);
        System.out.println(Car.name + " " + Car.engine);



        Car c2 = new Car("MEC c300","1300cc");
        System.out.println(Car.numberOfCars);
        System.out.println(Car.name + " " + Car.engine);

    }
}
