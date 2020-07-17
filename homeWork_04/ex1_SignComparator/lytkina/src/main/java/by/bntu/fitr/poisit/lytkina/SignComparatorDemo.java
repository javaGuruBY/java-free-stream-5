package by.bntu.fitr.poisit.lytkina;


public class SignComparatorDemo {
    public static void main(String[] args) {
        SignComparator signComparator = new SignComparator();

        int number = 0;
        String expected = "Number is equal to zero";
        String actual = signComparator.compare(number);

        SignComparatorTest signComparatorTest = new SignComparatorTest();
        signComparatorTest.checkThatEqual(expected, actual);

        System.out.println(actual);
    }

}
