class Complex {
    double real;
    double imag;
    void setData(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }
    void display()
    {
        System.out.println("The complex number is: "+real+" "+imag+"i");
    }
    public Complex add(Complex c1, Complex c2)
    {
        Complex res = new Complex();
        res.real = c1.real + c2.real;
        res.imag = c1.imag + c2.imag;
        return res;
    }
}

public class Q2_Complex
{
    public static void main(String args[])
    {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();
        c1.setData(2, 5);
        c2.setData(3, 4);
        c3 = c3.add(c1, c2);
        c3.display();
    }
}
