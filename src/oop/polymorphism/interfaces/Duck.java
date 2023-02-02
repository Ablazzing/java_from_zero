package oop.polymorphism.interfaces;

public class Duck implements Flyable, Swimable {

    public void swim() {
        System.out.println("Утка плывет");
    }

    public void fly() {
        System.out.println("Утка летит");
    }
}
