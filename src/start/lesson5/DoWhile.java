package start.lesson5;

public class DoWhile {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count < 0);

        System.out.println("Проверка неработоспособности while");
        while (count < 0) {
            System.out.println(count);
        }
    }
}
