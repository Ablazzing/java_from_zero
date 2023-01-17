package oop.basics.lesson7.practice;

//Создать класс машина с атрибутами "марка", "максимальная скорость". По умолчанию скорость 220.
//Создать конструкторы: на атрибут марка, на атрибуты "марка" и максимальная скорость
//Создать метод "разгон до 100": напечатать на экран "Скорость разгона до 100км/ч : [значение]"
//значение получаем по формуле: 110 / (максимальная скорость машины / 20).
public class Car {
    private String brand;
    private int maxSpeed = 220;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void investigateSpeed100() {
        double speed = 110d / (this.maxSpeed / 20d);
        System.out.printf("Скорость разгона до 100км/ч : %s\n", speed);
    }

    public String getBrand() {
        return brand;
    }
}
