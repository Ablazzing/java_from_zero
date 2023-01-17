package oop.basics.lesson8;

import java.util.Arrays;

public class Car {
    private String brand;
    //Статический атрибут
    public static int countCars = 0;
    public final static String BMW_INFO = "Bmw - немецкая компания, основанная 1928";
    public final static String AUDI_INFO = "Audi - немецкая компания, основанная 1933";
    public final static String KIA_INFO = "Kia - корейская компания, основанная 1978";
    public final static String[] BRAND_DESCRIPTIONS = new String[3];

    static {
        BRAND_DESCRIPTIONS[0] = BMW_INFO;
        BRAND_DESCRIPTIONS[1] = AUDI_INFO;
        BRAND_DESCRIPTIONS[2] = KIA_INFO;
        System.out.println(Arrays.toString(BRAND_DESCRIPTIONS));
    }

    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public int getCountCars() {
        return countCars;
    }

    public static void printBrands() {
        System.out.println("Перечень доступных брендов: bmw, audi, kia");
    }
}
