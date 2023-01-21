package oop.inheritance.lesson9;

public class Terier extends Dog {

    public Terier(int countTeeth) {
        super(countTeeth);
    }

    @Override
    public void breath() {
        System.out.println("Терьер дышит");
    }

    @Override
    public void run() {
        System.out.println("Терьер бежит");
    }
}
