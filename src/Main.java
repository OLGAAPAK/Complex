import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a1");
        var a1 = scanner.nextDouble();
        System.out.println("Enter b1");
        var b1 = scanner.nextDouble();
        System.out.println("Enter a2");
        var a2 = scanner.nextDouble();
        System.out.println("Enter b2");
        var b2 = scanner.nextDouble();

        Complex complex = new Complex(a1, b1, a2, b2);
        System.out.println(complex.add());
        System.out.println(complex.sub());
        System.out.println(complex.mul());
        System.out.println(complex.equal());
    }
}