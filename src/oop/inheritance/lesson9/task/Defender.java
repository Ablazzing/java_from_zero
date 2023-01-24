package oop.inheritance.lesson9.task;

public class Defender extends Human {

    public Defender(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Охранник получил 15_000");
    }
}
