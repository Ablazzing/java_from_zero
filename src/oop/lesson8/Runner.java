package oop.lesson8;

public class Runner {
    public static void main(String[] args) {
        Car audi = new Car("audi");
        Car bmw = new Car("bmw");
        System.out.println("Количество машин:" + Car.countCars);

        Car.printBrands();
    }
}
