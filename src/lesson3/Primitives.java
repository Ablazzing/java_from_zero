package lesson3;

public class Primitives {
    public static void main(String[] args) {
        //Логические значения (булевы значения) (bit)
        //ИСТИНА -> true -> да -> 1
        boolean answerYuri = true;
        //ЛОЖЬ -> false -> нет -> 0
        boolean answerPetr = false;

        //Целые числа
        //Byte - байт
        byte maxByte = 127;
        byte minByte = -128;

        //Short - короткое число, состоит из двух байт или из 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;

        //Integer - целое число, которое состоит из 4 байт или из 32 битов
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //Long - целое число, которое состоит из 8 байт или из 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        //Какие типы данных вы бы использовали, для ответов на вопросы:
        //Сколько людей на планете? - long
        //Сколько рук у человека - byte - int
        //Есть сигнал или нет? - boolean
        //Количество стран в мире? - byte - int
        //Сколько жителей в Монако? - int

        //Double - число с плавающей точкой, 64 bit
        double myBottle = 1.5;
        //Float - число с плавающей точкой, 32 bit
        float cola = 0.33F;

        double doubleNumber = 1.1234567890123467890;
        float floatNumber = 1.1234567890123467890F;
        //System.out.println(doubleNumber);
        //System.out.println(floatNumber);

        //Char - character (символ), 16 bit
        char letter = 70;
        //System.out.println(letter);

        char newLine = '\n';
        System.out.print("a");
        System.out.print(newLine);
        System.out.print("b\n");
        char tab = '\t';
        char escape = '\\';
        System.out.println(escape);
    }
}
