package OOPjava.HW5.Calculator;

public class CalcComplex extends ComplexNum implements Calc<ComplexNum> {

    public CalcComplex(double x, double y) {
        super(x, y);
    }

    @Override
    public ComplexNum sum(Double x, Double y) {
        x += y;
        a += b;
        return new ComplexNum(x, a);
    }

    @Override
    public ComplexNum diff(Double x, Double y) {
        x -= y;
        a -= b;
        return new ComplexNum(x, a);
    }

    @Override
    public ComplexNum div(Double x, Double y) {
        x = (x + a) / (y + b);
        return new ComplexNum(x, 0);
    }

    @Override
    public ComplexNum mult(Double x, Double y) {
        x = x * y + a * y + a * b;
        return new ComplexNum(x, 0);
    }

}
