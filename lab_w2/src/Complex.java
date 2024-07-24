
public class Complex {

    private double re;
    private double im;

    public Complex() {
        this.re = 0;
        this.im = 0;
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public void print() {
        System.out.println();
        String temp = re + " + " + im + "i";
        System.out.println(temp);
    }

    public Complex plus(Complex x) {
        return new Complex(this.re + x.re, this.im + x.im);
    }

    public Complex minus(Complex x) {
        return new Complex(this.re - x.re, this.im - x.im);
    }

    public Complex multiply(Complex x) {
        double a = this.re;
        double b = this.im;
        double c = x.re;
        double d = x.im;
        return new Complex(a * c - b * d, a * d + b * c);
    }

}
