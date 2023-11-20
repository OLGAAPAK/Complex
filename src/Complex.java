public class Complex {

    public double a1, a2, b1, b2;

    public Complex(int a1, int b1, int a2, int b2) {
        this.a1 = a1;
        this.b1 = b1;
        this.a2 = a2;
        this.b2 = b2;
    }

    public Complex(double a1, double b1, double a2, double b2) {
        this.a1 = a1;
        this.b1 = b1;
        this.a2 = a2;
        this.b2 = b2;
    }
    public String getZ1() {
        return a1 + " + " + b1 + "i";
    }

    public String getZ2() {
        return a2 + " + " + b2 + "i";
    }
    public String add() {
        double stA = a1 + a2;
        double stB = b1 + b2;
        return "(" + getZ1()+ ") + (" + getZ2() + ")" + " = " + stA + " + " + stB + "i";
    }
    public String sub() {
        double stA = a1 - a2;
        double stB = b1 - b2;
        return "(" + getZ1()+ ") - (" + getZ2() + ")" + " = " + stA + " + " + stB + "i";
    }
    public String mul() {
        double stA = a1 * a2 - b1 * b2;
        double stB = b1 * a2 + b2 * a1;
        return "(" + getZ1() + ") * (" + getZ2() + ")" + " = " + stA + " + " + stB + "i";
    }
    public String equal() {
        if (a1 == a2 && b1 == b2){
            return "equals";
        }
        else {
            return "not equals";
        }
    }
}
