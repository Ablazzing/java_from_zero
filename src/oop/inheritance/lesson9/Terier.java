package oop.inheritance.lesson9;

public class Terier extends Dog {
    @Override
    public void breath() {
        System.out.println("Терьер дышит");
    }

    @Override
    public void run() {
        System.out.println("Терьер бежит");
    }
}
