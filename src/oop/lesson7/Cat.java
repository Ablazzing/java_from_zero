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

    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерет диван %s", sofaOwner);
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
