package oop.inheritance.lesson9;

public class Runner {
    public static void main(String[] args) {
        //Пудель
        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();

        //Овчарка
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
    }
}
