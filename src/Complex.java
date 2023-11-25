public class Complex {

    public double real;
    public double image;

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }
    public static Complex sum(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.image + c2.image);
    }
    public static Complex sub(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.image - c2.image );
    }
    public static Complex mul(Complex c1, Complex c2) {
        return new Complex(c1.real * c2.real - c1.image * c2.image, c1.real * c2.image + c1.image * c2.real);
    }
    public static boolean equals(Complex c1, Complex c2) {
        double rc1 = Math.sqrt(Math.pow(c1.real, 2) + Math.pow(c1.image, 2));
        double rc2 = Math.sqrt(Math.pow(c2.real, 2)) + (Math.pow(c2.image, 2));
        return rc1 == rc2;
    }

    @Override
    public String toString() {
        return image >= 0 ? real + "+" + image + "i" : real + "" + image + "i";
    }
}
