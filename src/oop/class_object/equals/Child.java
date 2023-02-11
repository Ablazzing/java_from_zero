package oop.class_object.equals;

public class Child {
    private String name;
    private int year;

    public Child(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Началось сравнение с " + this.getName());
        if (obj == null) {
            return false;
        }
        if (obj instanceof Child child2) {
            return this.getName().equals(child2.getName()) && this.getYear() == child2.getYear();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getYear() % 2;
    }
}
