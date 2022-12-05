package oop.lesson7;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Muhtar", -10, "Petr");
        System.out.println(dog);
        dog.setWeight(-1);
        System.out.println(dog);

        System.out.println(dog.getOwner());

    }
}
