package oop.polymorphism;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal[] animals = new Animal[2];
        animals[0] = dog;
        animals[1] = cat;

        feedTwoAnimals(dog, cat);
    }

    public static void feedTwoAnimals(Animal animal1, Animal animal2) {
        animal1.eat();
        animal2.eat();
    }
}
