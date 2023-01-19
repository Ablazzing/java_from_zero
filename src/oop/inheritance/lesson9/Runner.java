package oop.inheritance.lesson9;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();

        //Пудель
        Poodle poodle = new Poodle();
        poodle.bark();

        //Овчарка
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
    }
}
