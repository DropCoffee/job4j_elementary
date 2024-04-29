package ru.job4j.calculator;

public class Fit {

    private static final short BASE_HEIGHT_MAN = 100;
    private static final double WEIGHT_MULTIPLIER = 1.15;
    private static final short BASE_HEIGHT_WOMAN = 110;

    public static double manWeight(short height) {
        return (height - BASE_HEIGHT_MAN) * WEIGHT_MULTIPLIER;
    }

    public static double womanWeight(short height) {
        return (height - BASE_HEIGHT_WOMAN) * WEIGHT_MULTIPLIER;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}