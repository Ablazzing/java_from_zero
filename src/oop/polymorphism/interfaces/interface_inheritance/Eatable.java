package oop.polymorphism.interfaces.interface_inheritance;

public interface Eatable {
    default void eat() {
        System.out.println("Объект ест");
    };
}
