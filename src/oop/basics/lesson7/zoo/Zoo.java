package oop.basics.lesson7.zoo;

import oop.basics.lesson7.Cat;
import oop.basics.lesson7.Dog;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat, Dog dog) {
        if (cat == null) {
            this.cat = new Cat("black", 15, "Petr");
        } else {
            this.cat = cat;
        }
        this.dog = dog;
    }

    public void feed() {
        cat.feed("Yuri", "Рыбу");
        dog.feed("Yuri", "Кости");
    }
}
