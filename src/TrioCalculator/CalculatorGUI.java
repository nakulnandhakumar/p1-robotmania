package TrioCalculator;

import javax.swing.*;

public class CalculatorGUI extends CalculatorContrl {
    public JPanel panel1;
    public JButton button_7;
    public JButton button_4;
    public JButton button_1;
    public JButton button_2;
    public JButton button_5;
    public JButton button_8;
    public JButton button_3;
    public JButton button_6;
    public JButton button_9;
    public JButton button_0;
    public JButton button_plus;
    public JButton button_minus;
    public JButton button_mult;
    public JButton button_div;
    public JButton button_mod;
    public JButton button_equals;
    public JLabel calcArea;
    public JButton button_power;
    public JButton button_sin;
    public JButton button_tan;
    public JButton button_cos;
    public JButton button_clear;

    private double calcAnswer;

    public void clearCalculator() {  // helper method to clear and update calculator to default
        // calculator control
        String calcAreaDefault = "0.0";
        calcArea.setText(calcAreaDefault);
        mathState = CalculatorContrl.STATE.INITIAL;
        initialCalcAreaInputState = true;
        model.setArg1(0.0);
        model.setArg2(0.0);
        calcAnswer = 0.0;
    }

    public void updateCalcArea(String string) {
        if (initialCalcAreaInputState) {  // sets text to string on initial key typed
            calcArea.setText(string);
            initialCalcAreaInputState = false;
        } else  {                         // concatenates string to end of text subsequent keys typed
            calcArea.setText(calcArea.getText() + string);
        }
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
            model.setArg1(Double.parseDouble((calcArea.getText())));
            mathState = CalculatorContrl.STATE.SAVE1;
            initialCalcAreaInputState = true;
            saveValueOfMathOp(Math.OPERATOR.PLUS);
        });

        button_minus.addActionListener(e -> {
            model.setArg1(Double.parseDouble((calcArea.getText())));
            mathState = CalculatorContrl.STATE.SAVE1;
            initialCalcAreaInputState = true;
            saveValueOfMathOp(Math.OPERATOR.MINUS);
        });

        button_mult.addActionListener(e -> {
            model.setArg1(Double.parseDouble((calcArea.getText())));
            mathState = CalculatorContrl.STATE.SAVE1;
            initialCalcAreaInputState = true;
            saveValueOfMathOp(Math.OPERATOR.MULTIPLY);
        });

        button_div.addActionListener(e -> {
            model.setArg1(Double.parseDouble((calcArea.getText())));
            mathState = CalculatorContrl.STATE.SAVE1;
            initialCalcAreaInputState = true;
            saveValueOfMathOp(Math.OPERATOR.DIVIDE);
        });

        button_power.addActionListener(e -> {
            model.setArg1(Double.parseDouble((calcArea.getText())));
            mathState = CalculatorContrl.STATE.SAVE1;
            initialCalcAreaInputState = true;
            saveValueOfMathOp(Math.OPERATOR.POWER);
        });

        button_mod.addActionListener(e -> {
            model.setArg1(Double.parseDouble((calcArea.getText())));
            mathState = CalculatorContrl.STATE.SAVE1;
            initialCalcAreaInputState = true;
            saveValueOfMathOp(Math.OPERATOR.MOD);
        });

        button_sin.addActionListener(e -> {
            model.setArg1(Double.parseDouble((calcArea.getText())));
            mathState = CalculatorContrl.STATE.SAVE1;
            initialCalcAreaInputState = true;
            saveValueOfMathOp(Math.OPERATOR.SIN);
            calcAnswer = calculateAnswer();
            calcArea.setText(String.valueOf(calcAnswer));
            model.setArg1(Double.parseDouble((calcArea.getText())));
        });

        button_cos.addActionListener(e -> {
            model.setArg1(Double.parseDouble((calcArea.getText())));
            mathState = CalculatorContrl.STATE.SAVE1;
            initialCalcAreaInputState = true;
            saveValueOfMathOp(Math.OPERATOR.COS);
            calcAnswer = calculateAnswer();
            calcArea.setText(String.valueOf(calcAnswer));
            model.setArg1(Double.parseDouble((calcArea.getText())));
        });

        button_tan.addActionListener(e -> {
            model.setArg1(Double.parseDouble((calcArea.getText())));
            mathState = CalculatorContrl.STATE.SAVE1;
            initialCalcAreaInputState = true;
            saveValueOfMathOp(Math.OPERATOR.TAN);
            calcAnswer = calculateAnswer();
            calcArea.setText(String.valueOf(calcAnswer));
            model.setArg1(Double.parseDouble((calcArea.getText())));
        });

        button_equals.addActionListener(e -> {
            if (mathState != CalculatorContrl.STATE.CALC) {
                model.setArg2(Double.parseDouble((calcArea.getText())));
                mathState = CalculatorContrl.STATE.SAVE2;
            }
            calcAnswer = calculateAnswer();
            calcArea.setText(String.valueOf(calcAnswer));
            model.setArg1(Double.parseDouble((calcArea.getText())));
        });

        button_clear.addActionListener(e -> clearCalculator());
    }
}

