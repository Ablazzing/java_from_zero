package oop.primitves_wrappers;

public class Runner {
    public static void main(String[] args) {
        String number = "1000";
        Integer numberInt = null;
        int numberPrimitive = numberInt;
        Integer numberWrapper = numberPrimitive;
        System.out.println(numberInt * 2);
    }
}
