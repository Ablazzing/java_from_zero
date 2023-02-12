package oop.enumeration;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //Задача:
        //Составить справочник стран, которым можно пользоваться в любом классе
        //Япония: население 140млн, язык японский
        //Греция: население 10млн, язык греческий
        //Аргентина: население 47млн, язык испанский
        System.out.println(Arrays.toString(Country.values()));
        System.out.println(Country.valueOf("JAPANY").getPeopleCount());

    }

    public static CountryOld[] getCountries() {
        CountryOld[] countries = new CountryOld[3];
        countries[0] = new CountryOld("Япония", 140_000_00l, "японский");
        countries[1] = new CountryOld("Греция", 10_000_00l, "греческий");
        countries[2] = new CountryOld("Аргентина", 47_000_00l, "испанский");
        return countries;
    }

}
