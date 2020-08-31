package by.jrr.sheremet.task1;

public class SignComparator {

    public String compare(int num) {
        if (num > 0) {
            return "Number is positive";
        }
        return num < 0 ? "Number is negative" : "Number is equal to zero";
    }
}
