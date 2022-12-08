package oop.lesson7;

import oop.lesson7.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Muhtar", -10, "Petr");
        Cat cat = new Cat("black", 10, "Yuri");
        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();

    }
}
