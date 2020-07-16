package by.bntu.fitr.poisit.lytkina;

public class Encoder {
    
    void encode(short code){
        char symbol = (char) code;
        System.out.println(code + "-->" + symbol);
    }
    void decode(char symbol){
        short code = (short) symbol;
        System.out.println(symbol + "-->" + code);
    }
}
