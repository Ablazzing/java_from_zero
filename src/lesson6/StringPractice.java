package lesson6;

public class StringPractice {
    public static void main(String[] args) {
        //Выбрать текст начиная c 11 символа до конца строки, перевести в нижний регистр,
        //разбить строку на массив по пробелу. Вывести на экран каждое слово из массива и длину строки этого слова
        String text = "my name is Giovanni Giorgio";
        String[] array = text.substring(11).toLowerCase().split(" ");
        for (String word : array) {
            System.out.println(word);
            System.out.println(word.length());
        }
    }
}
