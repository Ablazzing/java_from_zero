package oop.anonymous_classes;

public class Runner {
    public static void main(String[] args) {
        Alive dog = new Alive() {
            @Override
            public void breath() {
                System.out.println("Собака дышит");
            }

            @Override
            public void eat() {
                System.out.println("Собака ест");
            }
        };
        dog.eat();
        dog.breath();

        Animal duck = new Animal() {
            @Override
            public void move() {
                System.out.println("Утка летит");
            }
        };
        duck.move();
    }
}
