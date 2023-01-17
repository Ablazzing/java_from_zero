package oop.basics.lesson7;

import java.util.Arrays;

public class Cat {
    //Атрибут (свойство, поле)
    //public модификатор доступа (видно из всех классов)
    public String color;

    //default модификатор доступа (видно из классов с одинаковым пакетом)
    double weight;

    //private модификатор доступа (видно только внутри класса)
    private String ownerName;

    //Конструктор
    public Cat(String colorName, double weightCat, String owner) {
      this.color = colorName;
      this.weight = weightCat;
      this.ownerName = owner;
    }

    //Метод
    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерет диван %s\n", sofaOwner);
    }

    //Перегрузка (overloading) метода hunt
    public String hunt(boolean isDay) {
        if (isDay) {
            return "Мышь";
        }
        return "Сова";
    }

    //Перегрузка (overloading) метода hunt
    public String hunt(boolean isDay, boolean success) {
        if (success) {
            if (isDay) {
                return "Мышь";
            }
            return "Сова";
        }
        return "Ничего";
    }

    //Varargs
    public void feed(String giver, String ...product) {
        System.out.printf("Человек %s дает еду. Кот поел: %s\n", giver, Arrays.toString(product));
    }


    //Перегрузка (overloading) метода hunt
    public void hunt(String timesOfDay) {
        if (timesOfDay.equals("Утро")) {
            System.out.println("Мышь");
        } else {
            System.out.println("Комар");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
