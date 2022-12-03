package oop.lesson7;

public class Cat {
    String color;
    double weight;
    String ownerName;

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
