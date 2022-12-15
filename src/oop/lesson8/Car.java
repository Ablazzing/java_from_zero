package oop.lesson8;

public class Car {
    private String brand;
    //Статический атрибут
    public static int countCars = 0;

    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public int getCountCars() {
        return countCars;
    }

}
