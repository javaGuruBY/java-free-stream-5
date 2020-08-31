package by.jrr.sheremet.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SignComparatorTest {

    @Test
    public void compareShouldReturnStringWithZeroText() {
        SignComparator signComparator = new SignComparator();
        int num = 0;
        String expected = "Number is equal to zero";
        String actual = signComparator.compare(num);
        assertEquals(expected, actual);
    }

    @Test
    public void compareShouldReturnStringWithNegativeText() {
        SignComparator signComparator = new SignComparator();
        int num = -1;
        String expected = "Number is negative";
        String actual = signComparator.compare(num);
        assertEquals(expected, actual);
    }

    @Test
    public void compareShouldReturnStringWithPositiveText() {
        SignComparator signComparator = new SignComparator();
        int num = 1;
        String expected = "Number is positive";
        String actual = signComparator.compare(num);
        assertEquals(expected, actual);
    }
}