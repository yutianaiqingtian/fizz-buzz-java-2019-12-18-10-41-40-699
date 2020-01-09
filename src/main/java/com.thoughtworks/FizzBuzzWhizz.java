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

        if (!(isFizz | isBuzz | isWhizz)) {
            return isContainerThree(inputNumber) ? FIZZ : "";
        }

        return reportNumber(isFizz, isBuzz, isWhizz, inputNumber);
    }

    public static String reportNumber(boolean isOutputFizz, boolean isOutputBuzz, boolean isOutputWhizz, int inputNum) {
        String reportNumber = (isOutputFizz ? FIZZ : "") + (isOutputBuzz ? BUZZ : "") + (isOutputWhizz ? WHIZZ : "");
        return "".equals(reportNumber) ? String.valueOf(inputNum) : reportNumber;
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
