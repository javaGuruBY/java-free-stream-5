package by.jrr.maistrenko;

public class Encoder {

    public void encode(short code) {
        char symbol = (char) code;
        System.out.println(code + " - symbol: " + symbol);
    }

    public void decode(char symbol) {
        short code = (short) symbol;
        System.out.println(symbol + " - code: " + code);
    }
}
