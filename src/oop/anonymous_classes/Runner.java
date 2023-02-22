package oop.anonymous_classes;

public class Runner {
    public static void main(String[] args) {
        Alive dog = new Alive() {
            @Override
            public void eat() {
                System.out.println("Dog eat");
            }

            @Override
            public void breath() {
                System.out.println("Dog breath");
            }
        };
        dog.breath();
        dog.eat();

        Animal cat = new Animal() {
            @Override
            public void eat() {
                System.out.println("Кошка ест");
            }
        };
        cat.eat();

    }
}
