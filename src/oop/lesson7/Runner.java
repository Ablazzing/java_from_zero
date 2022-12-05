package oop.lesson7;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Black", 10, "Petr");
//        System.out.println(cat.color);
//        System.out.println(cat.ownerName);
//        System.out.println(cat.weight);
//        cat.color = "Red";
//        System.out.println(cat.color);

        cat.destroySofa("Петра");
        String animal = cat.hunt(false);
        String resultHunt2 = cat.hunt(false, false);
        cat.hunt("Утро");
        System.out.println(resultHunt2);
    }
}
