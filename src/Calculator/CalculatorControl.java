package Calculator;
import Calculator.Math.OPERATOR;

import javax.swing.*;

public class CalculatorControl extends JFrame {

    public boolean initialCalcAreaInputState;

    public enum STATE {INITIAL, SAVE1, SAVE2, CALC}

    public CalculatorControl.STATE mathState;

    // calculator values
    private Math.OPERATOR mathOp;
    public double arg1;
    public double arg2;
    public double calcAnswer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorGUI");
        frame.setContentPane(new CalculatorGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void calculateAnswer()  // method to perform calculation
    {
        calcAnswer = Calculator.Math.calculateIt(arg1, mathOp, arg2);
        mathState = CalculatorControl.STATE.CALC;
        initialCalcAreaInputState = true;
    }


    public void saveValueOfMathOp(OPERATOR op) { // method to store operator
        mathOp = op;
    }
}
