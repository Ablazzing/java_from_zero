package oop.basics.lesson7;

import java.util.Arrays;

public class Dog {
    //Значение по умолчанию
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Andrey";

    //Блок инициализации
    {
        System.out.println("Собака создалась!");
    }

    public Dog() {
    }

    //Перегрузка конструктора
    public Dog(String name, int weight, String owner) {
        if (weight < 1) {
            this.weight = 5;
        } else {
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public void feed(String giver, String ...product) {
        System.out.printf("Человек %s дает еду. Собака поела: %s\n", giver, Arrays.toString(product));
    }

    public void setWeight(int newWeight) {
        if (newWeight < 1) {
            this.weight = 5;
        } else {
            this.weight = newWeight;
        }
    }

    public String getOwner() {
        return "Mr." + owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
