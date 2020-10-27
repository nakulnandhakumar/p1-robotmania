package Calculator;

import Calculator.Math.OPERATOR;

import javax.swing.*;

public class CalculatorGUI extends JFrame {
    private JPanel panel1;
    private JButton button_7;
    private JButton button_4;
    private JButton button_1;
    private JButton button_2;
    private JButton button_5;
    private JButton button_8;
    private JButton button_3;
    private JButton button_6;
    private JButton button_9;
    private JButton button_0;
    private JButton button_plus;
    private JButton button_minus;
    private JButton button_mult;
    private JButton button_div;
    private JButton button_mod;
    private JButton button_equals;
    private JLabel calcArea;
    private JButton button_power;
    private JButton button_sin;
    private JButton button_tan;
    private JButton button_cos;
    private JButton button_clear;

    private boolean initialCalcAreaInputState;
    private enum STATE { INITIAL, SAVE1, SAVE2, CALC }

    private CalculatorGUI.STATE mathState;

    // calculator values
    private Math.OPERATOR mathOp;
    private double arg1;
    private double arg2;
    private double calcAnswer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorGUI");
        frame.setContentPane(new CalculatorGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void calculateAnswer()  // method to perform calculation
    {
        calcAnswer = Calculator.Math.calculateIt(arg1, mathOp, arg2);
        calcArea.setText(String.valueOf(calcAnswer));
        arg1 = Double.parseDouble(calcArea.getText());
        mathState = CalculatorGUI.STATE.CALC;
        initialCalcAreaInputState = true;
    }

    private void updateCalcArea(String string) {
        if (initialCalcAreaInputState) {  // sets text to string on initial key typed
            calcArea.setText(string);
            initialCalcAreaInputState = false;
        } else  {                         // concatenates string to end of text subsequent keys typed
            calcArea.setText(calcArea.getText() + string);
        }
    }

    private void saveValueOfArg1() { // method to store 1st value in calculation (arg1)
        arg1 = Double.parseDouble((calcArea.getText()));
        mathState = CalculatorGUI.STATE.SAVE1;
        initialCalcAreaInputState = true;
    }

    private void saveValueOfArg2() { // method to store 2nd value in calculation (arg2)
        if (mathState != CalculatorGUI.STATE.CALC) {
            arg2 = Double.parseDouble((calcArea.getText()));
            mathState = CalculatorGUI.STATE.SAVE2;
        }
    }

    private void saveValueOfMathOp(OPERATOR op) { // method to store operator
        mathOp = op;
    }

    private void clearCalculator() {  // helper method to clear and update calculator to default
        // calculator control
        String calcAreaDefault = "0.0";
        calcArea.setText(calcAreaDefault);
        mathState = CalculatorGUI.STATE.INITIAL;
        initialCalcAreaInputState = true;
        arg1 = 0.0;
        arg2 = 0.0;
        calcAnswer = 0.0;
    }

    public CalculatorGUI() {
        button_1.addActionListener(e -> updateCalcArea(button_1.getText()));
        button_2.addActionListener(e -> updateCalcArea(button_2.getText()));
        button_3.addActionListener(e -> updateCalcArea(button_3.getText()));
        button_4.addActionListener(e -> updateCalcArea(button_4.getText()));
        button_5.addActionListener(e -> updateCalcArea(button_5.getText()));
        button_6.addActionListener(e -> updateCalcArea(button_6.getText()));
        button_7.addActionListener(e -> updateCalcArea(button_7.getText()));
        button_8.addActionListener(e -> updateCalcArea(button_8.getText()));
        button_9.addActionListener(e -> updateCalcArea(button_9.getText()));
        button_0.addActionListener(e -> updateCalcArea(button_0.getText()));
        button_plus.addActionListener(e -> {
            saveValueOfArg1();
            saveValueOfMathOp(OPERATOR.PLUS);
        });
        button_minus.addActionListener(e -> {
            saveValueOfArg1();
            saveValueOfMathOp(OPERATOR.MINUS);
        });
        button_mult.addActionListener(e -> {
            saveValueOfArg1();
            saveValueOfMathOp(OPERATOR.MULTIPLY);
        });
        button_div.addActionListener(e -> {
            saveValueOfArg1();
            saveValueOfMathOp(OPERATOR.DIVIDE);
        });
        button_power.addActionListener(e -> {
            saveValueOfArg1();
            saveValueOfMathOp(OPERATOR.POWER);
        });
        button_mod.addActionListener(e -> {
            saveValueOfArg1();
            saveValueOfMathOp(OPERATOR.MOD);
        });
        button_sin.addActionListener(e -> {
            saveValueOfArg1();
            saveValueOfMathOp(OPERATOR.SIN);
            calculateAnswer();
        });
        button_cos.addActionListener(e -> {
            saveValueOfArg1();
            saveValueOfMathOp(OPERATOR.COS);
            calculateAnswer();
        });
        button_tan.addActionListener(e -> {
            saveValueOfArg1();
            saveValueOfMathOp(OPERATOR.TAN);
            calculateAnswer();
        });
        button_equals.addActionListener(e -> {
            saveValueOfArg2();
            calculateAnswer();
        });
        button_clear.addActionListener(e -> clearCalculator());
    }
}

