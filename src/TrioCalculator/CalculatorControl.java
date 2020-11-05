package TrioCalculator;

import javax.swing.*;

public class CalculatorControl extends JFrame {
    private JButton GUIButton;   // Initialize buttons, States, objects, and other variables
    private JPanel panel1;
    private JButton consoleButton;
    private CalculatorConsoleUI calculatorConsole = new CalculatorConsoleUI();

    public enum STATE {INITIAL, SAVE1, SAVE2, CALC}
    public CalculatorControl.STATE mathState;

    // calculator values
    CalculatorData model;
    CalculatorGUI view;

    public CalculatorControl() {
        this.model = new CalculatorData(); // Creates object "model" of CalcData class to manage data

        GUIButton.addActionListener(e -> {  // Button action to choose CalcGUI
            this.view = new CalculatorGUI(this);
            JFrame calcGUI = new JFrame("CalculatorGUI");
            calcGUI.setContentPane(view.panel1);
            calcGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            calcGUI.pack();
            calcGUI.setVisible(true);
        });

        consoleButton.addActionListener(e -> { // Button actions that runs ConsoleUI.main
            calculatorConsole.setUp();
        });
    }

    public double calculateAnswer()  // method to perform calculation
    {
        double calcAnswer = model.calculate();
        model.setArg1(calcAnswer);
        mathState = CalculatorControl.STATE.CALC;
        return calcAnswer;
    }

    public void saveValueOfArg1(double arg1)  // method to perform calculation
    {
        model.setArg1(arg1);
        mathState = CalculatorControl.STATE.SAVE1;
        view.initInputState();
    }

    public void saveValueOfArg2(double arg2)  // method to perform calculation
    {
        if (mathState != CalculatorControl.STATE.CALC) {
            model.setArg2(arg2);
            mathState = CalculatorControl.STATE.SAVE2;
        }
    }

    public void saveValueOfMathOp(Math.OPERATOR op) { // method to store operator
        model.setMathOp(op);
    }

    public void clearCalculator() {  // helper method to clear and update calculator to default
        // calculator control
        mathState = CalculatorControl.STATE.INITIAL;
        model = new CalculatorData();
        view.initCalcArea();
    }

    public static void main(String[] args) {  // main menu to set CalcMenu visisble
        JFrame calcMenu = new JFrame("CalculatorMenu");
        calcMenu.setContentPane(new CalculatorControl().panel1);
        calcMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcMenu.pack();
        calcMenu.setVisible(true);
    }
}
