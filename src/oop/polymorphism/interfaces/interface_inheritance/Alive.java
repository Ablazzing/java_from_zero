package oop.polymorphism.interfaces.interface_inheritance;

public interface Alive extends Eatable, Moveable{
    @Override
    default void eat() {
        Moveable.super.eat();
    }
}
