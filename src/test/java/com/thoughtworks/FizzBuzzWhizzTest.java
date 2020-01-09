package com.thoughtworks;

import org.junit.Test;

import static com.thoughtworks.FizzBuzzWhizz.fizzBuzzWhizz;
import static org.junit.Assert.assertEquals;

public class FizzBuzzWhizzTest {
    @Test
    public void shouldReturnFizzWhenGivenInputThree() {
        int input = 3;

        String result = fizzBuzzWhizz(input);

        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenGivenInputFive() {
        int input = 5;

        String result = fizzBuzzWhizz(input);

        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnWhizzWhenGivenInputSeven() {
        int input = 7;

        String result = fizzBuzzWhizz(input);

        assertEquals("Whizz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenGivenInputThreePlusFive() {
        int input = 3 * 5;

        String result = fizzBuzzWhizz(input);

        assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnFizzWhizzWhenGivenInputThreePlusSeven() {
        int input = 3 * 7;

        String result = fizzBuzzWhizz(input);

        assertEquals("FizzWhizz", result);
    }

    @Test
    public void shouldReturnBuzzWhizzWhenGivenInputFivePlusSeven() {
        int input = 5 * 7;

        String result = fizzBuzzWhizz(input);

        assertEquals("BuzzWhizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenGivenInputValueContainThree() {
        int input = 13;

        String result = fizzBuzzWhizz(input);

        assertEquals("Fizz", result);
    }

}