package oop.polymorphism.interfaces.task;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }
}
