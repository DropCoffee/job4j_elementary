package ru.job4j.array;

public class SimpleStringEncoder {

    private static String printCounter(int counter) {
        return counter == 1 ? "" : String.valueOf(counter);
    }

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result = result + symbol + printCounter(counter);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        return result + symbol + printCounter(counter);
    }
}