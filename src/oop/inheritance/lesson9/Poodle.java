package oop.inheritance.lesson9;

public class Poodle extends Dog {

    public void run() {
        System.out.println("Собака бежит медленно");
    }

    @Override
    public void breath() {
        System.out.println("Пудель дышит");
    }
}
