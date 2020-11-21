package TrioCalculator;

import TrioCalculator.Math.*;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class CalcUI extends JFrame {
    private final JLabel calcArea = new JLabel("");
    private double calcAnswer;  /** Definitions for local GUI variables **/
    private final String calcAreaDefault = "0.0";
    private boolean initialCalcAreaInputState;

    public void updateCalcArea(String string) {
        if (initialCalcAreaInputState) {  /** sets text to string on initial key typed **/
            calcArea.setText(string);
            initialCalcAreaInputState = false;
        } else  {                         /** concatenates string to end of text subsequent keys typed **/
            calcArea.setText(calcArea.getText() + string);
        }
    }

    public void initCalcArea() {    /** method for initializing calculator label when first opened and for clearing **/
        this.initInputState();
        calcArea.setText(calcAreaDefault);
    }

    public void initInputState() {  /** method to make sure that the user input replaces original calc label text **/
        initialCalcAreaInputState = true;
    }

    /**
     * Create the frame.
     */
    public CalcUI(CalculatorControl calcControl) {
        getContentPane().setBackground(new Color(0, 0, 0));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 418, 575);
        getContentPane().setLayout(null);
        calcArea.setForeground(Color.WHITE);
        calcArea.setFont(new Font("Lucida Grande", Font.PLAIN, 72));
        calcArea.setHorizontalAlignment(SwingConstants.RIGHT);
        calcArea.setBounds(18, 6, 377, 67);
        getContentPane().add(calcArea);
        
        JButton button_1 = new JButton("1");
        button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_1.setBackground(Color.BLACK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                button_1.setBackground(Color.PINK);
            }
        });
        button_1.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_1.setOpaque(true);
        button_1.setForeground(Color.WHITE);
        button_1.setBackground(Color.PINK);
        button_1.addActionListener(e -> updateCalcArea(button_1.getText()));
        button_1.setBounds(35, 86, 75, 40);
        getContentPane().add(button_1);
        
        JButton button_2 = new JButton("2");
        button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_2.setBackground(Color.BLACK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                button_2.setBackground(Color.PINK);
            }
        });
        button_2.addActionListener(e -> updateCalcArea(button_2.getText()));
        button_2.setOpaque(true);
        button_2.setForeground(Color.WHITE);
        button_2.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_2.setBackground(Color.PINK);
        button_2.setBounds(122, 86, 75, 40);
        getContentPane().add(button_2);
        
        JButton button_3 = new JButton("3");
        button_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_3.setBackground(Color.BLACK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                button_3.setBackground(Color.PINK);
            }
        });
        button_3.addActionListener(e -> updateCalcArea(button_3.getText()));
        button_3.setOpaque(true);
        button_3.setForeground(Color.WHITE);
        button_3.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_3.setBackground(Color.PINK);
        button_3.setBounds(209, 86, 75, 40);
        getContentPane().add(button_3);
        
        JButton button_4 = new JButton("4");
        button_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_4.setBackground(Color.BLACK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                button_4.setBackground(Color.PINK);
            }
        });
        button_4.addActionListener(e -> updateCalcArea(button_4.getText()));
        button_4.setOpaque(true);
        button_4.setForeground(Color.WHITE);
        button_4.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_4.setBackground(Color.PINK);
        button_4.setBounds(35, 138, 75, 40);
        getContentPane().add(button_4);
        
        JButton button_5 = new JButton("5");
        button_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_5.setBackground(Color.BLACK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                button_5.setBackground(Color.PINK);
            }
        });
        button_5.addActionListener(e -> updateCalcArea(button_5.getText()));
        button_5.setOpaque(true);
        button_5.setForeground(Color.WHITE);
        button_5.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_5.setBackground(Color.PINK);
        button_5.setBounds(122, 138, 75, 40);
        getContentPane().add(button_5);
        
        JButton button_6 = new JButton("6");
        button_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_6.setBackground(Color.BLACK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                button_6.setBackground(Color.PINK);
            }
        });
        button_6.addActionListener(e -> updateCalcArea(button_6.getText()));
        button_6.setOpaque(true);
        button_6.setForeground(Color.WHITE);
        button_6.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_6.setBackground(Color.PINK);
        button_6.setBounds(209, 138, 75, 40);
        getContentPane().add(button_6);
        
        JButton button_7 = new JButton("7");
        button_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_7.setBackground(Color.BLACK);
            }
            
            public void mouseReleased(MouseEvent e) {
                button_7.setBackground(Color.PINK);
            }
        });
        button_7.addActionListener(e -> updateCalcArea(button_7.getText()));
        button_7.setOpaque(true);
        button_7.setForeground(Color.WHITE);
        button_7.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_7.setBackground(Color.PINK);
        button_7.setBounds(35, 190, 75, 40);
        getContentPane().add(button_7);
        
        JButton button_8 = new JButton("8");
        button_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_8.setBackground(Color.BLACK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                button_8.setBackground(Color.PINK);
            }
        });
        button_8.addActionListener(e -> updateCalcArea(button_8.getText()));
        button_8.setOpaque(true);
        button_8.setForeground(Color.WHITE);
        button_8.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_8.setBackground(Color.PINK);
        button_8.setBounds(122, 190, 75, 40);
        getContentPane().add(button_8);
        
        JButton button_9 = new JButton("9");
        button_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_9.setBackground(Color.BLACK);
            }
            
            public void mouseReleased(MouseEvent e) {
                button_9.setBackground(Color.PINK);
            }
        });
        button_9.addActionListener(e -> updateCalcArea(button_9.getText()));
        button_9.setOpaque(true);
        button_9.setForeground(Color.WHITE);
        button_9.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_9.setBackground(Color.PINK);
        button_9.setBounds(209, 190, 75, 40);
        getContentPane().add(button_9);
        
        JButton button_0 = new JButton("0");
        button_0.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_0.setBackground(Color.BLACK);
            }
            
            public void mouseReleased(MouseEvent e) {
                button_0.setBackground(Color.PINK);
            }
        });
        button_0.addActionListener(e -> updateCalcArea(button_0.getText()));
        button_0.setOpaque(true);
        button_0.setForeground(Color.WHITE);
        button_0.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_0.setBackground(Color.PINK);
        button_0.setBounds(122, 242, 75, 40);
        getContentPane().add(button_0);
        
        JButton button_plus = new JButton("+");
        button_plus.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_plus.setBackground(Color.WHITE);
            }
            
            public void mouseReleased(MouseEvent e) {
                button_plus.setBackground(Color.PINK);
            }
        });
        button_plus.addActionListener(e -> {
            calcControl.saveValueOfArg1(Double.parseDouble((calcArea.getText()))); /** Control code saves arg1 value **/
            calcControl.saveValueOfMathOp(Math.OPERATOR.PLUS); /** Control code saves operator used in calculation **/
        });
        button_plus.setOpaque(true);
        button_plus.setForeground(Color.WHITE);
        button_plus.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_plus.setBackground(Color.PINK);
        button_plus.setBounds(327, 138, 75, 40);
        getContentPane().add(button_plus);
        
        JButton button_minus = new JButton("-");
        button_minus.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_minus.setBackground(Color.WHITE);
            }
            
            public void mouseReleased(MouseEvent e) {
                button_minus.setBackground(Color.PINK);
            }
        });
        button_minus.addActionListener(e -> {
            calcControl.saveValueOfArg1(Double.parseDouble((calcArea.getText())));
            calcControl.saveValueOfMathOp(Math.OPERATOR.MINUS);
        });
        button_minus.setOpaque(true);
        button_minus.setForeground(Color.WHITE);
        button_minus.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_minus.setBackground(Color.PINK);
        button_minus.setBounds(327, 190, 75, 40);
        getContentPane().add(button_minus);

        JButton button_mult = new JButton("x");
        button_mult.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_mult.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                button_mult.setBackground(Color.PINK);
            }
        });
        button_mult.addActionListener(e -> {
            calcControl.saveValueOfArg1(Double.parseDouble((calcArea.getText())));
            calcControl.saveValueOfMathOp(Math.OPERATOR.MULTIPLY);
        });
        button_mult.setOpaque(true);
        button_mult.setForeground(Color.WHITE);
        button_mult.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_mult.setBackground(Color.PINK);
        button_mult.setBounds(327, 242, 75, 40);
        getContentPane().add(button_mult);

        JButton button_div = new JButton("/");
        button_minus.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_div.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                button_div.setBackground(Color.PINK);
            }
        });
        button_div.addActionListener(e -> {
            calcControl.saveValueOfArg1(Double.parseDouble((calcArea.getText())));
            calcControl.saveValueOfMathOp(Math.OPERATOR.DIVIDE);
        });
        button_div.setOpaque(true);
        button_div.setForeground(Color.WHITE);
        button_div.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_div.setBackground(Color.PINK);
        button_div.setBounds(327, 294, 75, 40);
        getContentPane().add(button_div);

        JButton button_power = new JButton("^");
        button_power.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_power.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                button_power.setBackground(Color.PINK);
            }
        });
        button_power.addActionListener(e -> {
            calcControl.saveValueOfArg1(Double.parseDouble((calcArea.getText())));
            calcControl.saveValueOfMathOp(Math.OPERATOR.POWER);
        });
        button_power.setOpaque(true);
        button_power.setForeground(Color.WHITE);
        button_power.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_power.setBackground(Color.PINK);
        button_power.setBounds(327, 346, 75, 40);
        getContentPane().add(button_power);

        JButton button_mod = new JButton("%");
        button_mod.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_mod.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                button_mod.setBackground(Color.PINK);
            }
        });
        button_mod.addActionListener(e -> {
            calcControl.saveValueOfArg1(Double.parseDouble((calcArea.getText())));
            calcControl.saveValueOfMathOp(Math.OPERATOR.MOD);
        });
        button_mod.setOpaque(true);
        button_mod.setForeground(Color.WHITE);
        button_mod.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_mod.setBackground(Color.PINK);
        button_mod.setBounds(327, 398, 75, 40);
        getContentPane().add(button_mod);

        JButton button_sin = new JButton("SIN");
        button_sin.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_sin.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                button_sin.setBackground(Color.PINK);
            }
        });
        button_sin.addActionListener(e -> {
            calcControl.saveValueOfArg1(Double.parseDouble((calcArea.getText())));
            calcControl.saveValueOfMathOp(Math.OPERATOR.SIN);
            /** single op method calls calculation method after first argument entered **/
            calcAnswer = calcControl.calculateAnswer();
            calcArea.setText(String.valueOf(calcAnswer)); /** sets calc label to calculated answer **/
        });
        button_sin.setOpaque(true);
        button_sin.setForeground(Color.WHITE);
        button_sin.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_sin.setBackground(Color.PINK);
        button_sin.setBounds(35, 450, 75, 40);
        getContentPane().add(button_sin);

        JButton button_cos = new JButton("COS");
        button_cos.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_cos.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                button_cos.setBackground(Color.PINK);
            }
        });
        button_cos.addActionListener(e -> {
            calcControl.saveValueOfArg1(Double.parseDouble((calcArea.getText())));
            calcControl.saveValueOfMathOp(Math.OPERATOR.COS);
            /** single op method calls calculation method after first argument entered **/
            calcAnswer = calcControl.calculateAnswer();
            calcArea.setText(String.valueOf(calcAnswer)); /** sets calc label to calculated answer **/
        });
        button_cos.setOpaque(true);
        button_cos.setForeground(Color.WHITE);
        button_cos.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_cos.setBackground(Color.PINK);
        button_cos.setBounds(122, 450, 75, 40);
        getContentPane().add(button_cos);

        JButton button_tan = new JButton("TAN");
        button_tan.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_tan.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                button_tan.setBackground(Color.PINK);
            }
        });
        button_tan.addActionListener(e -> {
            calcControl.saveValueOfArg1(Double.parseDouble((calcArea.getText())));
            calcControl.saveValueOfMathOp(Math.OPERATOR.TAN);
            /** single op method calls calculation method after first argument entered **/
            calcAnswer = calcControl.calculateAnswer();
            calcArea.setText(String.valueOf(calcAnswer)); /** sets calc label to calculated answer **/
        });
        button_tan.setOpaque(true);
        button_tan.setForeground(Color.WHITE);
        button_tan.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_tan.setBackground(Color.PINK);
        button_tan.setBounds(209, 450, 75, 40);
        getContentPane().add(button_tan);
        
        JButton button_equals = new JButton("=");
        button_equals.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_equals.setBackground(Color.WHITE);
            }
            
            public void mouseReleased(MouseEvent e) {
                button_equals.setBackground(Color.PINK);
            }
        });
        button_equals.addActionListener(e -> {
            calcControl.saveValueOfArg2(Double.parseDouble((calcArea.getText())));
            calcAnswer = calcControl.calculateAnswer();
            calcArea.setText(String.valueOf(calcAnswer));
        });
        button_equals.setOpaque(true);
        button_equals.setForeground(Color.WHITE);
        button_equals.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_equals.setBackground(Color.PINK);
        button_equals.setBounds(327, 450, 75, 40);
        getContentPane().add(button_equals);
        
        JButton button_clear = new JButton("AC");
        button_clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button_clear.setBackground(Color.WHITE);
            }
            
            public void mouseReleased(MouseEvent e) {
                button_clear.setBackground(Color.PINK);
            }
        });
        button_clear.addActionListener(e -> calcControl.clearCalculator());
        button_clear.setOpaque(true);
        button_clear.setForeground(Color.BLACK);
        button_clear.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        button_clear.setBackground(new Color(221, 160, 221));
        button_clear.setBounds(327, 86, 75, 40);
        getContentPane().add(button_clear);

    }
}






    
