package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");
        float dollar = Converter.rubleToDollar(60);
        System.out.println("60 rubles are " + dollar + " dollar");

        float inputRubToEuro = 140;
        float exceptedEuro = 2;
        float outputEuro = Converter.rubleToEuro(inputRubToEuro);
        boolean passedEuro = exceptedEuro == outputEuro;
        System.out.println("140 rubles are 2. Test result: " + passedEuro);

        float inputRubToDollar = 60;
        float exceptedDollar = 1;
        float outputDollar = Converter.rubleToDollar(inputRubToDollar);
        boolean passedDollar = exceptedDollar == outputDollar;
        System.out.println("60 rubles are 1. Test result: " + passedDollar);
    }
}
