package oop.lesson7;

public class RecursionEx {
    public static void main(String[] args) {
        //Задача: посчитать сумму всех чисел от 1 до значения k
        int k = 10;
        Recursion recursion = new Recursion();
        int result = recursion.sum(k);
        System.out.println(result);

    }
}
