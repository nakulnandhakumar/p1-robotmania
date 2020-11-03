package TrioCalculator;

import javax.swing.*;

public class CalculatorMenu extends JFrame {
    private JButton GUIButton;   // Initialize buttons, States, objects, and other variables
    private JPanel panel1;
    private JButton consoleButton;
    private CalculatorConsoleUI calculatorConsole = new CalculatorConsoleUI();

    public CalculatorMenu() {

        GUIButton.addActionListener(e -> {  // Button action to choose CalcGUI
            CalculatorControl.main(null);
        });

        consoleButton.addActionListener(e -> { // Button actions that runs ConsoleUI.main
            calculatorConsole.setUp();
        });
    }

    public static void main(String[] args) {  // main menu to set CalcMenu visisble
        JFrame calcMenu = new JFrame("CalculatorMenu");
        calcMenu.setContentPane(new CalculatorMenu().panel1);
        calcMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcMenu.pack();
        calcMenu.setVisible(true);
    }
}
