package OOPjava.HW5.Calculator;

public class ComplexNum extends ValuesNum {

    public ComplexNum(double x, double y) {
        super.x = x;
        super.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ComplexNum compNum = (ComplexNum) obj;
        return super.x == compNum.x && super.y == compNum.y;
    }

    @Override
    public String toString() {
        return "ComplexNum: x = " + x + " y = " + y;
    }
}
