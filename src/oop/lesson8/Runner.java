package oop.lesson8;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car audi = new Car("audi");
        Car bmw = new Car("bmw");

        Car.BRAND_DESCRIPTIONS[0] = "Любое значение";
        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));
    }
}
