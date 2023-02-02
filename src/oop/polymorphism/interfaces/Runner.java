package oop.polymorphism.interfaces;

public class Runner {
    public static void main(String[] args) {
        //У нас есть бассейн (в нем могут быть только те объекты, которые умеют плавать)
        //У нас есть небо (в нем могут быть только те объекты, которые умеют летать)
        //Есть три класса:
        //Рыба - умеет плавать
        //Утка - умеет плавать и летать
        //Самолет - умеет летать
        //Создать по экземпляру каждого класса, и определить, где они могут находиться (в бассейне и/или в небе)

        //?[] pool = fish, duck
        //?[] sky = duck, airplane
        Fish fish = new Fish();
        Duck duck = new Duck();
        Airplane airplane = new Airplane();

        Flyable[] sky = {duck, airplane};
        Swimable[] pool = {duck, fish};
        for (Flyable flyable : sky) {
            flyable.fly();
        }

        for (Swimable swimable : pool) {
            swimable.swim();
        }


    }
}
