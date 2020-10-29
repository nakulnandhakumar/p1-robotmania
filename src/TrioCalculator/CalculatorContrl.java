package TrioCalculator;

import javax.swing.*;
import java.util.Scanner;
import TrioCalculator.Math.OPERATOR;

public class CalculatorContrl extends JFrame {
    private JButton GUIButton;   // Initialize buttons, States, objects, and other variables
    private JPanel panel1;
    private JButton consoleButton;

    public boolean initialCalcAreaInputState;

    public enum STATE {INITIAL, SAVE1, SAVE2, CALC}

    public CalculatorContrl.STATE mathState;

    // calculator values
    CalculatorData model;

    public CalculatorContrl() {

        this.model = new CalculatorData(); // Creates object "model" of CalcData class to manage data

        GUIButton.addActionListener(e -> {  // Button action to choose CalcGUI
            JFrame calcGUI = new JFrame("CalculatorGUI");
            calcGUI.setContentPane(new CalculatorGUI().panel1);
            calcGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            calcGUI.pack();
            calcGUI.setVisible(true);
        });

        consoleButton.addActionListener(e -> { // Button actions that runs ConsoleUI.main
            CalculatorConsoleUI.main(null);
        });
    }

    public static void main(String[] args) {  // main menu to set CalcMenu visisble
        JFrame calcMenu = new JFrame("CalculatorMenu");
        calcMenu.setContentPane(new CalculatorContrl().panel1);
        calcMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcMenu.pack();
        calcMenu.setVisible(true);
    }

    public double calculateAnswer()  // method to perform calculation
    {
        double calcAnswer = model.calculate();
        mathState = CalculatorContrl.STATE.CALC;
        initialCalcAreaInputState = true;
        return calcAnswer;
    }

    public void saveValueOfArg1(double arg1)  // method to perform calculation
    {
        model.setArg1(arg1);
    }

    public void saveValueOfArg2(double arg2)  // method to perform calculation
    {
        model.setArg2(arg2);
    }

    public void saveValueOfMathOp(Math.OPERATOR op) { // method to store operator
        model.setMathOp(op);
    } // Save's the operation for calculation
}
