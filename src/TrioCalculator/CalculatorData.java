package TrioCalculator;
import TrioCalculator.Math.OPERATOR;

public class CalculatorData {
    // calculator values
    private Math.OPERATOR mathOp;
    private double arg1;
    private double arg2;
    private double calcAnswer;

    public CalculatorData() {
        arg1 = 0.0;
        arg2 = 0.0;
        calcAnswer = 0.0;
        mathOp = Math.OPERATOR.NOOP;
    }

    public void setMathOp(Math.OPERATOR value) {
        mathOp = value;
    }

    public void setArg1(double value) {
        arg1 = value;
    }

    public void setArg2(double value) {
        arg2 = value;
    }

    public double calculate() {
        return Math.calculateIt(arg1, mathOp, arg2);
    }
}
