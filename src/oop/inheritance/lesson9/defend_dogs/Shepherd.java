package oop.inheritance.lesson9.defend_dogs;

import oop.inheritance.lesson9.dogs.Dog;

public final class Shepherd extends Dog {

    public Shepherd() {
        super(28);
    }

    @Override
    public void run() {
        System.out.println("Собака бежит быстро");
    }

    @Override
    public void breath() {
        System.out.println("Овчарка дышит");
    }

    @Override
    public void bark() {
        System.out.println("Овчарка громко лает");
    }

    @Override
    public void beAngry() {
        //Атрибут из класса родителя
        //Текст из своего метода
        //вызывал метод родителя
        //Текст из своего метода
        System.out.println("Собака стоит на " + super.countLegs + ".");
        System.out.println("Овчарка увидела чужого человека");
        super.beAngry();
        System.out.println("Овчарка успокоилась");
    }
}
