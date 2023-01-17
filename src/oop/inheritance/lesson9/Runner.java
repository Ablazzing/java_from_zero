package oop.inheritance.lesson9;

public class Runner {
    public static void main(String[] args) {
        //Отец
        FatherLord fatherLord = new FatherLord();
        fatherLord.sayOnFrench();

        //Сын
        SonLord sonLord = new SonLord();
        sonLord.sayOnFrench();

        //Дочь
        FatherLord daughterLord = new DaughterLord();
        daughterLord.sayOnFrench();

        //Второй сын
        FatherLord sonLord2 = new SonLord();

        //Вся семья
        FatherLord[] family = {fatherLord, sonLord, daughterLord, sonLord2};
    }
}
