package oop.class_object.equals_hashcode_practise;

public class Task {
    public static void main(String[] args) {
        //Задача
        //Создать класс пользователь (логин, пароль).
        //Создать два пользователя:
        //1 - login: ablazzing, pass: 111111
        //2 - login: ablazzing, pass: 222222
        //Сделать так, чтобы хэшкоды этих объектов были равны, но equals возвращал false (т.е объекты не равны).
        User user1 = new User("ablazzing", "111111");
        User user2 = new User("ablazzing", "222222");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));
    }
}
