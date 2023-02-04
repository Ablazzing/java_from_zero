package oop.polymorphism.interfaces.dependency_inversion;

public class DogZoo {
    private Dog dog1;
    private Dog dog2;

    public DogZoo(Dog dog1, Dog dog2) {
        System.out.println("Конструктор для любых двух собак");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }

    public DogZoo(Poodle poodle, Shepherd shepherd) {
        System.out.println("Конструктор для пуделя и овчарки");
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }
}
