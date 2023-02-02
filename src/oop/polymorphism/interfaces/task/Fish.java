package oop.polymorphism.interfaces.task;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Рыба плывет");
    }
}
