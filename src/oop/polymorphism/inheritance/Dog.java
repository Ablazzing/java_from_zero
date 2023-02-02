package oop.polymorphism.inheritance;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    public void bark() {
        System.out.println("Собака гавкает");
    }
}
