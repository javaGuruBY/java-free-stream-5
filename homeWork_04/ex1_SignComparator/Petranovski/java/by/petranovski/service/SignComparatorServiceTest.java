package by.petranovski.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class SignComparatorServiceTest {

    @Test
    public void comparePositiveTest() {
        SignComparatorService signComparatorService = new SignComparatorService();
        int number = 7;
        if (7 > 0) {
            String expected = "Number is positive";
            String actual = signComparatorService.compare(number);
            assertEquals(expected, actual);
        }
    }
    @Test
    public void compareNegativeTest() {
        SignComparatorService signComparatorService = new SignComparatorService();
        int number = - 100;
        if (-100 > 0) {
            String expected = "Number is negative";
            String actual = signComparatorService.compare(number);
            assertEquals(expected, actual);
        }
    }
    @Test
    public void compareZeroTest() {
        SignComparatorService signComparatorService = new SignComparatorService();
        int number = 0;
        if (0 == 0) {
            String expected = "Number is equal to zero";
            String actual = signComparatorService.compare(number);
            assertEquals(expected, actual);
        }
    }
}