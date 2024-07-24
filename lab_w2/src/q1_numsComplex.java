
public class q1_numsComplex {

    public static void main(String[] args) {
        Complex c = new Complex(1, 5);
        c.print();

        Complex b = new Complex(4, -5);
        b.print();

        Complex plus = c.plus(b);
        plus.print();

        Complex minus = c.minus(b);
        minus.print();

        Complex multiply = c.multiply(b);
        multiply.print();
    }

}
