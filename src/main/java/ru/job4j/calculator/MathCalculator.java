package ru.job4j.calculator;

import static ru.job4j.calculator.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumOfSubtractionAndDivide(double first, double second) {
        return sum(subtraction(first, second), divide(first, second));
    }

    public static double sumOfSubtractionAndDivideAndSumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + subtraction(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
