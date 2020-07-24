package by.petranovski;

import by.petranovski.service.EncoderService;

public class EncoderDemo {
    public static void main(String[] args) {
        short code = 65;
        char symbol = 'F';
        EncoderService encoderService = new EncoderService();
        encoderService.encode(code);
        encoderService.decode(symbol);
    }
}
