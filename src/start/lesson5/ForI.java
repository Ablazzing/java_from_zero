package start.lesson5;

public class ForI {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        //Первые три числа
        for (int i = 0; i < 3; i++) {
            System.out.println("Значение - i:" + i);
            System.out.println(numbers[i]);
        }

        //Вывод в перевернутом порядке
        for (int i = 3; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }

        //Все элементы массива, кроме последних двух
        for (int i = 0; i < numbers.length - 2; i++) {
            System.out.println(numbers[i]);
        }
    }
}
