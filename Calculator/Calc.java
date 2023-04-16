package OOPjava.HW5.Calculator;

public interface Calc<N> {
    N sum(Double num1, Double num2);
    N diff(Double num1, Double num2);
    N mult(Double num1, Double num2);
    N div(Double num1, Double num2);
}
