package by.petranovski.service;

public class EncoderService {
    public void encode(short code) {
        char symbol = (char)code;
        System.out.println(code + " => " + symbol);

    }
    public void decode(char symbol) {
        short code = (short)symbol;
        System.out.println(symbol + " => " + code);

    }
}
