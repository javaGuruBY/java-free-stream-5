package by.jrr.kashlyak;
//%
public class Remainder {
    private double a;
    private double b;

    public Remainder(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double calculate(){
        return a % b;
    }
}
