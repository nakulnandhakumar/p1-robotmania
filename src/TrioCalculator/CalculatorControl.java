package TrioCalculator;

import javax.swing.*;

public class CalculatorControl extends JFrame { /** Extends JFrame so that GUI library methods can be used **/
    private JButton GUIButton;   /** Initialize buttons, States, objects, and other variables **/
    private JPanel panel1;
    private JButton consoleButton;
    private CalculatorConsoleUI calculatorConsole = new CalculatorConsoleUI();

    public enum STATE {INITIAL, SAVE1, SAVE2, CALC}
    public CalculatorControl.STATE mathState;

    /** Defines calculator objects for both model and view **/
    CalculatorData model;
    CalculatorGUI view;

    public CalculatorControl() {
        this.model = new CalculatorData(); /** Instantiates new object model of CalculatorModel class **/

        GUIButton.addActionListener(e -> {  /** Button action to choose CalcGUI **/
            this.view = new CalculatorGUI(this); /** Using view object of CalculatorGUI class, instantiates GUI **/
            JFrame calcGUI = new JFrame("CalculatorGUI");
            calcGUI.setContentPane(view.panel1);
            calcGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            calcGUI.pack();
            calcGUI.setVisible(true);
        });

        consoleButton.addActionListener(e -> { /** Button actions that runs ConsoleUI.main **/
            calculatorConsole.setUp();
        });
    }

    public double calculateAnswer()  /** asks model class to calculate answer with saved values below and return answer **/
    {
        double calcAnswer = model.calculate();
        model.setArg1(calcAnswer);
        mathState = CalculatorControl.STATE.CALC;
        return calcAnswer;
    }

    public void saveValueOfArg1(double arg1)  /** sends arg1 value to model class to be saved **/
    {
        model.setArg1(arg1);
        mathState = CalculatorControl.STATE.SAVE1;
        view.initInputState();
    }

    public void saveValueOfArg2(double arg2)  /** sends arg2 value to model class to be saved **/
    {
        if (mathState != CalculatorControl.STATE.CALC) {
            model.setArg2(arg2);
            mathState = CalculatorControl.STATE.SAVE2;
        }
    }

    public void saveValueOfMathOp(Math.OPERATOR op) {
        model.setMathOp(op);
    } /** saves the operation type in the model class **/

    public void clearCalculator() {
        mathState = CalculatorControl.STATE.INITIAL;
        model = new CalculatorData();
        view.initCalcArea();
    } /** method to refresh all variables by creating new model object and using view object to clear calculator **/

    public static void main(String[] args) {
        JFrame calcMenu = new JFrame("CalculatorMenu");
        calcMenu.setContentPane(new CalculatorControl().panel1);
        calcMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcMenu.pack();
        calcMenu.setVisible(true);
    } /** main menu to set CalcMenu visible so User can choose if they want to use ConsoleMenu or the GUI **/
}
