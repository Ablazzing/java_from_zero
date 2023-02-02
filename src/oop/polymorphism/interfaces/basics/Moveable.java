package oop.polymorphism.interfaces.basics;

public interface Moveable {
    int count = 1;

    void move();

    default void back() {
        System.out.println("Возвращаемся назад");
    }
}
