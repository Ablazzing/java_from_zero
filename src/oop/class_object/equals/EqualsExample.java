package oop.class_object.equals;

public class EqualsExample {
    public static void main(String[] args) {
        Child child1 = new Child("Киров Сергей", 2019);
        Child child2 = new Child("Петров Иван", 2019);
        Child child3 = new Child("Меньшикова Анастасия", 2019);
        Child child4 = new Child("Иванов Валентин", 2018);

        Child[] children = {child2, child1, child3, child4};
        ChildrenGarden childrenGarden = new ChildrenGarden(children);

        boolean result = false;
        Child childForFind = new Child("Киров Сергей", 2018);

        for (Child child : childrenGarden.getChildren()) {
            if (child.equals(childForFind)) {
                result = true;
                break;
            }
        }
        System.out.println(result);


    }
}
