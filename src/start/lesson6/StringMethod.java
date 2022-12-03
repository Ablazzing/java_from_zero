package start.lesson6;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello world!";
        //Перевод в верхний регистр
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        //Перевод в нижний регистр
        String textLower = text.toLowerCase();
        System.out.println(textLower);

        //Длина строки
        int length = text.length();
        System.out.println(length);

        //Есть ли в тексте другой текст?
        boolean containsHello = text.contains("Hello");
        System.out.println(containsHello);

        //Замена всех кусков текста(подстроки) на другой текст
        String replacedText = text.replaceAll("l", "a");
        System.out.println(replacedText);

        //Повторить текст n раз
        String repeatedText = text.repeat(10);
        System.out.println(repeatedText);

        //Разбить текст на массив String
        String names = "Yuri;Olga;Petr;Vasya";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));

        //Объединение строк (Конкатенация)
        String word1 = "hi ";
        String word2 = "friend";
        String result = word1 + word2;
        System.out.println(result);

        //Начинается на подстроку
        boolean startsWithHel = text.startsWith("Hel");
        System.out.println(startsWithHel);

        //Заканчивается на подстроку
        boolean endsWithWorld = text.endsWith("world!");
        System.out.println(endsWithWorld);

        //Обрезка строки (Первые 5 символов)
        String firstFiveLetters = text.substring(0, 5);
        System.out.println(firstFiveLetters);

        String lenghtText2 = "hello".replaceAll("l", "a").toUpperCase();
        System.out.println(lenghtText2);
    }
}
