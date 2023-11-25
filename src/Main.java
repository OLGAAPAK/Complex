import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(2, 3);
        Complex complex2 = new Complex(3, 4);

        System.out.println(Complex.sum(complex1, complex2));
        System.out.println(Complex.sub(complex1, complex2));
        System.out.println(Complex.mul(complex1, complex2));
        System.out.println(Complex.equals(complex1, complex2));
    }
}