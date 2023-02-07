package oop.polymorphism.instanseof_ex;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal dog = new Dog();
        Animal[] zoo = {cat, dog};
//        Cat dog1 = (Cat) dog;
//        Animal cat2 = cat;

        for (Animal animal : zoo) {
            if (animal instanceof Cat cat1) {
                cat1.sayMeow();
            }
        }
    }
}
