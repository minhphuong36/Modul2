package students;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Naruto");
        s1.setClasses("12B1");
        System.out.println("Name: " + s1.getName() + " Class: " + s1.getClasses());
    }
}
