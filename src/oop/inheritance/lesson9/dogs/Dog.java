package oop.inheritance.lesson9.dogs;

import oop.inheritance.lesson9.Alive;

public abstract class Dog extends Alive {
    protected final int countLegs = 4;
    public int countTeeth;

    public static final String LATIN_NAME = "Canis familiaris";

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void beAngry() {
        System.out.println("Собака рычит");
    }

    public void bark() {
        System.out.println("Собака громко лает");
    }

    public final void eat() {
        System.out.println("Собака ест");
    }

    public abstract void run();
}
