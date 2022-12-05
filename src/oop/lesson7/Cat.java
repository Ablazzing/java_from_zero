package oop.lesson7;

public class Cat {
    //Атрибут (свойство, поле)
    String color;
    double weight;
    String ownerName;

    //Конструктор
    public Cat(String colorName, double weightCat, String owner) {
      this.color = colorName;
      this.weight = weightCat;
      this.ownerName = owner;
    }

    //Метод
    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерет диван %s\n", sofaOwner);
    }

    //Перегрузка (overloading) метода hunt
    public String hunt(boolean isDay) {
        if (isDay) {
            return "Мышь";
        }
        return "Сова";
    }

    //Перегрузка (overloading) метода hunt
    public String hunt(boolean isDay, boolean success) {
        if (success) {
            if (isDay) {
                return "Мышь";
            }
            return "Сова";
        }
        return "Ничего";
    }

    //Перегрузка (overloading) метода hunt
    public void hunt(String timesOfDay) {
        if (timesOfDay.equals("Утро")) {
            System.out.println("Мышь");
        } else {
            System.out.println("Комар");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
