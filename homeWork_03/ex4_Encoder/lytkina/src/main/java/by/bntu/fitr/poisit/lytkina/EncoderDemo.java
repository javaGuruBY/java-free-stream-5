package by.bntu.fitr.poisit.lytkina;

public class EncoderDemo {
    public static void main(String[] args) {
        short code = 65;
        Encoder encoder = new Encoder();
        encoder.encode(code);

        char symbol = 'F';
        encoder.decode(symbol);
    }
}
