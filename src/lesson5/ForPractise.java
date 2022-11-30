package lesson5;

public class ForPractise {
    public static void main(String[] args) {
        //Практическое задание №1
        //Распечатать все четные числа из массива numbers2
        int[] numbers2 = {3, 2, 10, 5, 8};
        for (int number : numbers2) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("_____________________");
        //Практическое задание №2
        //Распечатать все элементы под четными индексами из массива numbers2
        for (int i = 0; i < numbers2.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numbers2[i]);
            }
        }
    }
}
