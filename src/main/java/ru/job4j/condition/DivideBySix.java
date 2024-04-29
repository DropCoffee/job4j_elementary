package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String result;
        boolean isNumberDivedByThree = number % 3 == 0;
        boolean isNumberEven = number % 2 == 0;
        if (isNumberDivedByThree && isNumberEven) {
            result = "The number divides by 6.";
        } else if (isNumberDivedByThree) {
            result = "The number divides by 3, but it isn't the even number.";
        } else if (isNumberEven) {
            result = "The number doesn't divide by 3, but it is the even number.";
        } else {
            result = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return result;
    }
}