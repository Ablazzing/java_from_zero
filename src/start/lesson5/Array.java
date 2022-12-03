package start.lesson5;

import java.util.Arrays;

/**
 * Массив (array) - предназначен для хранения множества значений одинакового типа
 */
public class Array {
    public static void main(String[] args) {
        int x = 5;
        int y = x;
        x = 10;
        System.out.println(x);
        System.out.println(y);

        int[] array = {x, y};
        int[] array2 = new int[2];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[0] = 13;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        //Практическое задание
        //Ответить на вопрос "Столица Катара?" и записать в массив (какого то типа)
        char[] answer = {'Д', 'о', 'х', 'a'};

    }
}
