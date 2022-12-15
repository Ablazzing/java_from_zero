package oop.task;

public class Task {
    public static void main(String[] args) {
        //Создать сеть ресторанов, которая обладает общими, для всех ресторанов, запасами продуктов: сосиски, хлеб.
        //Каждый ресторан может подать блюдо: тогда минус 1 сосиска и два куска хлеба из общего запаса.
        //Если сосисок или хлеба не хватает, тогда вывести на экран: нет ингредиентов!
        //Каждый ресторан может принять партию товара: плюс 100 сосисок и 200 кусков хлеба.
        //Запасы продуктов должны быть скрыты от чужих глаз!
        Restaurant restaurant = new Restaurant();
        Restaurant restaurant2 = new Restaurant();
        restaurant.cookHotDog();
        restaurant2.addProducts();
        restaurant.cookHotDog();
    }
}
