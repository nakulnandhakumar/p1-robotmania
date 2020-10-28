package TrioCalculator;

import javax.swing.*;
import java.util.Scanner;
import TrioCalculator.Math.OPERATOR;

public class CalculatorContrl extends JFrame {
    private JButton GUIButton;
    private JPanel panel1;
    private JButton consoleButton;

    public boolean initialCalcAreaInputState;

    public enum STATE {INITIAL, SAVE1, SAVE2, CALC}

    public CalculatorContrl.STATE mathState;

    // calculator values
    CalculatorData model;

    public CalculatorContrl() {

        this.model = new CalculatorData();

        GUIButton.addActionListener(e -> {
            JFrame calcGUI = new JFrame("CalculatorGUI");
            calcGUI.setContentPane(new CalculatorGUI().panel1);
            calcGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            calcGUI.pack();
            calcGUI.setVisible(true);
        });

        consoleButton.addActionListener(e -> {
            CalculatorConsoleUI.main(null);
        });
    }

    public static void main(String[] args) {
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

    public void saveValueOfMathOp(Math.OPERATOR op) { // method to store operator
        model.setMathOp(op);
    }
}
