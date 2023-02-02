package oop.polymorphism.inheritance;

public class Runner {
    public static void main(String[] args) {
        //При создании экземпляра класса Dog, мы можем записать это в переменную типа Dog и всех наследников
        Dog dog = new Dog();
        //В примере ниже, мы так же создали собаку, но переменная dog имеет тип Animal
        //Поэтому будут доступны все методы и атрибуты Animal
        //Animal dog = new Dog();

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
