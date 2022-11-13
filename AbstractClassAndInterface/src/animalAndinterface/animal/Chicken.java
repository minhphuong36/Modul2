package animalAndinterface.animal;

import animalAndinterface.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: Cục Tácccc";
    }

    @Override
    public String howToEat() {
        return " mổ mổ";
    }
}
