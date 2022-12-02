package factorymethod;

import factorymethod.Animal;

public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }
}
