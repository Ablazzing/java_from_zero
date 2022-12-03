package start.lesson6;

public class TextBlock {
    public static void main(String[] args) {
        //String text = "Привет, как тебя зовут?\nМеня зовут Юрий. А тебя?\nМеня зовут Петр!";
        String name1 = "Гена";
        String name2 = "Вася";
        String text = """
                Привет, как тебя зовут?
                Меня зовут %s. А тебя?
                Меня зовут %s!
                """.formatted(name1, name2);
        System.out.println(text);
    }
}
