package com.thoughtworks;

import java.util.Arrays;

/**
 * @author jinghui.zhang
 */
public class FizzBuzzWhizz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public static String fizzBuzzWhizz(int inputNumber) {
        boolean isFizz = isThreePlus(inputNumber);
        boolean isBuzz = isFivePlus(inputNumber);
        boolean isWhizz = isSevenPlus(inputNumber);

        String reportNumber = (isFizz ? FIZZ : "") + (isBuzz ? BUZZ : "") + (isWhizz ? WHIZZ : "");

        if (!(isFizz | isBuzz | isWhizz)) {
            reportNumber += isContainerThree(inputNumber) ? FIZZ : "";
        }

        return "".equals(reportNumber) ? String.valueOf(inputNumber) : reportNumber;
    }

    private static boolean isContainerThree(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int index = Arrays.binarySearch(chars, '3');
        return index >= 0;
    }

    private static boolean isSevenPlus(int num) {
        return num % 7 == 0;
    }

    private static boolean isFivePlus(int num) {
        return num % 5 == 0;
    }

    private static boolean isThreePlus(int num) {
        return num % 3 == 0;
    }

}
