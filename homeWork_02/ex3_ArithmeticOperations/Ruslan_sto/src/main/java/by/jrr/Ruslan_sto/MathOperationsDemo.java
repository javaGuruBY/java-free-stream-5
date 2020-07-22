package by.jrr.Ruslan_sto;

public class MathOperationsDemo {

    public static void main(String[] args) {

        System.out.println("Welcome to Math Operations!");

        int a=2;
        int b=3;
        int add=a+b;
        System.out.println("1. Addition");
        System.out.println();
        System.out.println("a = "+a+" , b = "+b);
        System.out.println("a + b = "+a+" + "+b+" = "+ add);
        System.out.println();

        byte c=4;
        byte d=5;
        int sub=c-d;
        System.out.println("2. Subtraction");
        System.out.println();
        System.out.println("c = "+c+", d = "+d);
        System.out.println("c +d = "+c+ " - "+d+" = "+sub);
        System.out.println();

        long e=6;
        long f=7;
        long mult=e*f;
        System.out.println("3. Multiplication");
        System.out.println();
        System.out.println("e = "+e+" , f = "+f);
        System.out.println("e * f = "+e+" * "+f+" = "+mult);
        System.out.println();

        short x=8;
        short z=0;

        if (z!=0)
        {int div=x/z;
        System.out.println(" x = "+x+" , z = "+z);
            System.out.println("x / z = "+x+" / "+z+" = "+div);
        }

        else
            {System.out.println("Error operation");
            }
            }
}
