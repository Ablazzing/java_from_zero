package lesson4;

/**
 * Булева логика - операции с типом данных boolean
 */
public class BooleanLogic {
    public static void main(String[] args) {
        //Сынок купил хлеб
        boolean isBoughtBread = true;
        //Сынок купил молоко
        boolean isBoughtMilk = true;

        //And - Логическое И, если два значения true, то тогда true, иначе false
        boolean isBoughtMilkAndBread = isBoughtBread && isBoughtMilk;
        //boolean isBoughtMilkAndBread = true && true;
        //boolean isBoughtMilkAndBread = true;

        //boolean isBoughtMilkAndBread = false && false;
        //boolean isBoughtMilkAndBread = false;

        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Молодец сынок, купил хлеб и молоко");
        } else if (isBoughtMilk) {
            System.out.println("Молодец сынок, хотя бы купил молоко");
        } else if (isBoughtBread) {
            System.out.println("Молодец сынок, хотя бы купил хлеб");
        } else {
            System.out.println("Сынок ты не молодец, хлеба нет и молока нет");
        }

        //Or - Логическое или, если хотя бы одно значение true, то тогда true, и только если все значения false,
        //то тогда false
        boolean isBoughtMilkOrBread = true || true;
        //boolean isBoughtMilkOrBread = true;
        //boolean isBoughtMilkOrBread = true || false;
        //boolean isBoughtMilkOrBread = true;
        //boolean isBoughtMilkOrBread = false || false;
        //boolean isBoughtMilkOrBread = false;


        //NOT - Логическое не, который переворачивает значение true на false и наоборот
        //Купил сладости или нет
        boolean isBoughtCandy = false;

        if (!isBoughtCandy) {
            System.out.println("Мама хвалит сына");
        }
    }
}
