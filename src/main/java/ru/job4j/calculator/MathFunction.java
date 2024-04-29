package ru.job4j.calculator;

public class MathFunction {

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double divide(double first, double second) {
        return first / second;
    }

    public static double subtraction(double first, double second) {
        return first - second;
    }

    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        int result1 = MathFunction.func1(3);
        int result2 = MathFunction.func2(5);
        int total = result1 + result2;
        System.out.println(total);
        int result3 = MathFunction.func1(100);
        System.out.println(result3);
    }
}