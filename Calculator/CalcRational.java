package OOPjava.HW5.Calculator;

public class CalcRational extends ValuesNum implements Calc<Double>{

    public CalcRational() {
    }

    @Override
    public Double sum(Double num1, Double num2) {
        return num1 + num2;
    }

    @Override
    public Double diff(Double num1, Double num2) {
        return num1 - num2;
    }

    @Override
    public Double div(Double num1, Double num2) {
        return num1 / num2;
    }

    @Override
    public Double mult(Double num1, Double num2) {
        return num1 * num2;
    }

}
