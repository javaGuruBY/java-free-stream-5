package by.jrr.Ruslan_sto_HW3_Ex4_Encoder;

public class Encoder {
    public int a;
//    public short b;
//    public short c;

    public char A;
//    public char B;
//    public char C;
    public Encoder(50,"A"){
     this.a=a;
        this.A=A;
//        this.b=b;
//        this.B=B;
    }
    public void decode(){
        System.out.println(a+" => "+A);
    }
    public void encode(){
        System.out.println(A+" => "+a);
    }
}
//    public String a;//65
//    public String b;//66
//
//    public Encoder() {
//    }
//    public Encoder(String a, String b){
//        this.a = a;
//        this.b = b;
//    }
//    public void decode() {
//        System.out.println(a + " => 'A'");//1
//        System.out.println(b + " => 'B'");//2
//    }
//
//    public void encode() {
//        System.out.println("'A' => " + a);//1
//        System.out.println("'B' => " + b);//2
//    }
//}


//    public short code;
//    public char symbol;
//    public void encode(short code) {
//        this.code=code;
//        this.symbol=symbol;
//        System.out.println(this.code+" => "+"'"this.symbol"'");
//
//    }
//
//    public void decode(char symbol) {
//        this.code=code;
//        this.symbol=symbol;
//        System.out.println("'"this.symbol"'"+" = > "+this.code);
//
//    }
//
//}
