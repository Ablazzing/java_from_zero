package oop.primitves_wrappers;

public class IntegerWrapper {
    private int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }

    public void parse(String text) {
        if (text.equals("1000")) {
            value = 1000;
        }
    }
}
