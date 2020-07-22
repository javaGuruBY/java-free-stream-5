package by.jrr.maistrenko;

public class EncoderDemo {
    public static void main(String[] args) {
        short code = 78;
        char symbol = 'j';

        Encoder encoder = new Encoder();
        encoder.encode(code);
        encoder.decode(symbol);
    }
}
