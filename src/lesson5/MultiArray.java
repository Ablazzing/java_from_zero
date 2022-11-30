package lesson5;

public class MultiArray {
    public static void main(String[] args) {
        //Ограбили магазин. Вор был ростом 178.
        //Следователь нашел две группы людей около магазина. Задача найти вора по росту.
        int[] group1 = {180, 179, 190};
        int[] group2 = {165, 178, 193};
        int[][] multiArray = {group1, group2};

        upperFor:
        for (int[] array : multiArray) {
            for (int number : array) {
                if (number == 178) {
                    System.out.println("Нашли вора!");
                    break upperFor;
                } else {
                    System.out.println("Человек не подошел по росту");
                }
            }
        }
    }
}
