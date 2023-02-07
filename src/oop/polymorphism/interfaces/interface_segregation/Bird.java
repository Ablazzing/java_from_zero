package oop.polymorphism.interfaces.interface_segregation;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
