package oop.class_object;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Class<? extends Cat> catClass = cat.getClass();
        System.out.println(catClass.getName());

        System.out.println(cat.toString());
    }
}
