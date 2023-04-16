package OOPjava.HW5.Calculator;

public class Main {
    public static void main(String[] args) {
        CalcComplex calcComp = new CalcComplex(15, 37);
        calcComp.setA(3.2);
        calcComp.setB(3.17);
        System.out.println(calcComp.sum(calcComp.getX(), calcComp.getY()));
        System.out.println(calcComp.div(calcComp.getX(), calcComp.getY()));
        System.out.println(calcComp.mult(calcComp.getX(), calcComp.getY()));
        System.out.println(calcComp.diff(calcComp.getX(), calcComp.getY()));
        
        CalcRational calcRat = new CalcRational();
        double number1 = 45.6;
        double number2 = 12.3;
        System.out.println(calcRat.sum(number1, number2));
        System.out.println(calcRat.diff(number1, number2));
        System.out.println(calcRat.mult(number1, number2));
        System.out.println(calcRat.div(number1, number2));

        ToFile.toFile(calcRat.mult(number1, number2).toString());
    }
}
