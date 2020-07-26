package by.jrr.mikhalchenko.service;

import by.jrr.mikhalchenko.bean.SignComparato;

public class SignComparatoService {
    public String DetermineTheSignOfTheNumber(SignComparato signComparato) {
        if (signComparato.getNumber() > 0) {
            return "Number is positive";
        } else if (signComparato.getNumber() < 0) {
            return "Number is negative";
        } else {
            return "Number is equal to zero";
        }
    }
}
