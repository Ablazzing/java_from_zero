package lesson4;

public class Practice {
    public static void main(String[] args) {
        //Практическое задание
        //Проверить работоспособность машины: двигатель(Engine) и трансмиссия(Transmission) - работают,
        //и хотя бы 3 колеса из 4 не проколоты
        //Если машина работоспособна - вывести на экран - машина готова к эксплуатации
        //Если машина НЕработоспособна - вывести на экран - машина сломана
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isFineWheel1 = true;
        boolean isFineWheel2 = true;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = true;
        int countFineWheels = 0;
        countFineWheels += isFineWheel1 ? 1 : 0;
        countFineWheels += isFineWheel2 ? 1 : 0;
        countFineWheels += isFineWheel3 ? 1 : 0;
        countFineWheels += isFineWheel4 ? 1 : 0;

        if (isWorkEngine && isWorkTransmission && (countFineWheels >= 3)) {
            System.out.println("Машина готова к эксплуатации");
        } else {
            System.out.println("Машина сломана");
        }
    }
}
