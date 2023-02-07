package oop.polymorphism.interface_marker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        if (bird instanceof Alive) {
            System.out.println("Этот объект живой!");
        }
        if (airplane instanceof Alive) {
            System.out.println("Этот объект живой!");
        } else {
            System.out.println("Этот объект не живой!");
        }
    }
}
