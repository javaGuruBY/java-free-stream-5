package by.jrr.mikhalchenko.service;

import by.jrr.mikhalchenko.bean.SignComparato;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignComparatoServiceTest {

    @Test
    public void printAPositiveNumber() {
        SignComparato signComparato = new SignComparato(10);
        SignComparatoService signComparatoService = new SignComparatoService();
        if (signComparato.getNumber() > 0) {
            String expected = "Number is positive";
            String actual = signComparatoService.DetermineTheSignOfTheNumber(signComparato);
            assertEquals(expected, actual);

        }
    }

    @Test
    public void printANegativeNumber() {
        SignComparato signComparato = new SignComparato(-5);
        SignComparatoService signComparatoService = new SignComparatoService();
        if (signComparato.getNumber() > 0) {
            String expected = "Number is negative";
            String actual = signComparatoService.DetermineTheSignOfTheNumber(signComparato);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void outputZero() {
        SignComparato signComparato = new SignComparato(0);
        SignComparatoService signComparatoService = new SignComparatoService();
        if (signComparato.getNumber() == 0) {
            String expected = "Number is equal to zero";
            String actual = signComparatoService.DetermineTheSignOfTheNumber(signComparato);
            assertEquals(expected, actual);
        }
    }
}

