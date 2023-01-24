package oop.inheritance.lesson9.task2;

//Франция имеет 67_000_000 человек, французский язык, континент: Евразия
//Аргентина имеет 47_000_000 человек, испанский язык, континент: Южная Америка
//Италия имеет 58_000_000 человек, итальянский язык, континент: Евразия
public class CountriesGuide {
    public static final Country FRANCE = new Country(67_000_000L, "Французский", "Евразия");
    public static final Country ARGENTINA = new Country(47_000_000L, "Испанский", "Южная Америка");
    public static final Country ITALY = new Country(58_000_000L, "Итальянский", "Евразия");

    private CountriesGuide() {}
}
