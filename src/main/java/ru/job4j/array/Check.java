package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean zeroElement = data[0];
        for (boolean dt : data) {
            if (dt != zeroElement) {
                result = false;
                break;
            }
        }
        return result;
    }
}