package oop.inheritance.lesson9.task1;

//Каждый человек умеет получать зарплату(характерную для его профессии).
//У каждого человека есть пол.
public abstract class Human {
    private boolean isMan;

    public Human(boolean isMan) {
        this.isMan = isMan;
    }

    public boolean isMan() {
        return isMan;
    }

    public abstract void getSalary();
}
