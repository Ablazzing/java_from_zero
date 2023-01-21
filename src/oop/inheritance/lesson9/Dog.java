package oop.inheritance.lesson9;

public abstract class Dog extends Alive {
    public int countLegs = 4;

    public void bark() {
        System.out.println("Собака громко лает");
    }

    public abstract void run();
}
