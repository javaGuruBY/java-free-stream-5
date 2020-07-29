package by.petranovski.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class SignComparatorServiceTest {

    @Test
    public void comparePositiveTest() {
        SignComparatorService signComparatorService = new SignComparatorService();
        int number = 7;
        String expected = "Number is positive";
        String actual = signComparatorService.compare(number);
        assertEquals(expected, actual);
    }
    @Test
    public void compareNegativeTest() {
        SignComparatorService signComparatorService = new SignComparatorService();
        int number = - 100;
        String expected = "Number is negative";
        String actual = signComparatorService.compare(number);
        assertEquals(expected, actual);
    }
    @Test
    public void compareZeroTest() {
        SignComparatorService signComparatorService = new SignComparatorService();
        int number = 0;
        String expected = "Number is equal to zero";
        String actual = signComparatorService.compare(number);
        assertEquals(expected, actual);
    }
}