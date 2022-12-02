package factorymethod;

import factorymethod.Animal;

public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow";
    }
}
