package TrioCalculator;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculatorControl extends JFrame { /** Extends JFrame so that GUI library methods can be used **/
    /** Initialize buttons, States, objects, and other variables **/
    private CalculatorConsoleUI calculatorConsole = new CalculatorConsoleUI();

    public enum STATE {INITIAL, SAVE1, SAVE2, CALC}
    public CalculatorControl.STATE mathState;

    /** Defines calculator objects for both model and view **/
    CalculatorData model;
    CalcUI view;

    public CalculatorControl() {
        this.model = new CalculatorData(); /** Instantiates new object model of CalculatorModel class **/

        getContentPane().setBackground(new Color(175, 238, 238));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 418, 315);
        getContentPane().setLayout(null);

        JButton button_gui = new JButton("GUI");
        button_gui.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_gui.setBackground(Color.BLACK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                button_gui.setBackground(Color.PINK);
            }
        });
        button_gui.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_gui.setOpaque(true);
        button_gui.setForeground(Color.WHITE);
        button_gui.setBackground(Color.PINK);
        button_gui.addActionListener(e -> {
            this.view = new CalcUI(this); /** Using view object of CalculatorGUI class, instantiates GUI **/
            view.setVisible(true);
        });
        button_gui.setBounds(35, 86, 75, 40);
        getContentPane().add(button_gui);

        JButton button_console = new JButton("CONSOLE");
        button_console.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_console.setBackground(Color.BLACK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                button_console.setBackground(Color.PINK);
            }
        });
        button_console.addActionListener(e -> {
            calculatorConsole.setUp();
        });
        button_console.setOpaque(true);
        button_console.setForeground(Color.WHITE);
        button_console.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_console.setBackground(Color.PINK);
        button_console.setBounds(122, 86, 75, 40);
        getContentPane().add(button_console);
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
        CalculatorControl calcSetUp = new CalculatorControl();
        calcSetUp.setVisible(true);
    } /** main menu to set CalcMenu visible so User can choose if they want to use ConsoleMenu or the GUI **/
}

