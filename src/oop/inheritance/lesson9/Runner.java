package oop.inheritance.lesson9;

import oop.inheritance.lesson9.dogs.Poodle;
import oop.inheritance.lesson9.defend_dogs.Shepherd;
import oop.inheritance.lesson9.dogs.Terier;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Инфо о пуделе");
        //Пудель
        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        System.out.println(poodle.countTeeth);
        System.out.println("_______________\n");

        System.out.println("Инфо об овчарке");
        //Овчарка
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
        shepherd.beAngry();
        System.out.println(shepherd.countTeeth);
        System.out.println("_______________\n");


        System.out.println("Инфо о терьере");
        //Терьер
        Terier terier = new Terier(40);
        System.out.println(terier.countTeeth);
        System.out.println("_______________\n");
    }
}
