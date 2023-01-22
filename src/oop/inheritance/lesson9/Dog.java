package oop.inheritance.lesson9;

public abstract class Dog extends Alive {
    public int countLegs = 4;
    public int countTeeth;

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void beAngry() {
        System.out.println("Собака рычит");
    }

    public void bark() {
        System.out.println("Собака громко лает");
    }

    public abstract void run();
}
