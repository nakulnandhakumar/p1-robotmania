package TrioCalculator;
import TrioCalculator.Math.OPERATOR;

public class CalculatorData { /** Model of Calculator Views **/
    /** Initialize local calculator values for calculation **/
    private Math.OPERATOR mathOp;
    private double arg1;
    private double arg2;
    private double calcAnswer;

    public CalculatorData() { /** initialize and setDefault all Calc variables **/
        arg1 = 0.0;
        arg2 = 0.0;
        calcAnswer = 0.0;
        mathOp = Math.OPERATOR.NOOP;
    }

    public void setMathOp(Math.OPERATOR value) { /** save operator for math operation **/
        mathOp = value;
    } /** method to save sent operator value locally **/

    public void setArg1(double value) { /** save arg1 from calc **/
        arg1 = value;
    }

    public void setArg2(double value) { /** save arg2 from calc **/
        arg2 = value;
    }

    public double calculate() { /** calculate and return answer to control code **/
        calcAnswer = Math.calculateIt(arg1, mathOp, arg2);
        return calcAnswer;
    }
}
