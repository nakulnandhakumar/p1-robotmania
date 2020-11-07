//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
// New annotations made by Sara in order to grasp the UI to incorporate in our version.

package SanviSaraCalculator;

import javax.swing.*; // These items are necessary to run the code; contain UI info
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculatorUI extends JFrame {
    private final JLabel calcArea = new JLabel("");
    // This is how the result is stored. This is crucial for the calculator.

    private boolean initialCalcAreaInputState;
    private STATE mathState;
    private Math.OPERATOR mathOp;
    private double arg1;
    private double arg2;
    private double calcAnswer;

    public static void main(String[] args) { // Creates the calculator frame
        EventQueue.invokeLater(() -> {
            try {
                CalculatorUI frame = new CalculatorUI();
                frame.setVisible(true);
            } catch (Exception var1) {
                var1.printStackTrace();
            }

        });
    }

    private void calculateAnswer() { //This is how the calculation is established.
        this.calcAnswer = Math.calculateIt(this.arg1, this.mathOp, this.arg2);
        this.calcArea.setText(String.valueOf(this.calcAnswer));
        this.arg1 = Double.parseDouble(this.calcArea.getText());
        this.mathState = STATE.CALC;
        this.initialCalcAreaInputState = true;
    }

    private void updateCalcArea(String string) {  // This is how the code is added to the JLabel.
        if (this.initialCalcAreaInputState) {
            this.calcArea.setText(string);
            this.initialCalcAreaInputState = false;
        } else {
            JLabel var10000 = this.calcArea;
            String var10001 = this.calcArea.getText();
            var10000.setText(var10001 + string);
        }

    }

    private void saveValueOfArg1() { // The first value the user enters is stored here.
        this.arg1 = Double.parseDouble(this.calcArea.getText());
        this.mathState = STATE.SAVE1;
        this.initialCalcAreaInputState = true;
    }

    private void saveValueOfArg2() { // The second value the user enters is stored here.
        if (this.mathState != STATE.CALC) {
            this.arg2 = Double.parseDouble(this.calcArea.getText());
            this.mathState = STATE.SAVE2;
        }

    }

    private void saveValueOfMathOp(Math.OPERATOR op) {
        this.mathOp = op;
    } // This is where the operation is stored.

    private void clearCalculator() {
        String calcAreaDefault = "0.0";
        this.calcArea.setText(calcAreaDefault);
        this.mathState = STATE.INITIAL;
        this.initialCalcAreaInputState = true;
        this.arg1 = 0.0D;
        this.arg2 = 0.0D;
        this.calcAnswer = 0.0D;
    }

    public CalculatorUI() { // These functions should be done using swing designer
        this.getContentPane().setBackground(new Color(29, 147, 187)); //Background color
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 418, 450);
        this.getContentPane().setLayout((LayoutManager)null);
        this.calcArea.setForeground(Color.BLACK);
        this.calcArea.setFont(new Font("Times New Roman", 0, 72)); //Font, fontsize
        this.calcArea.setHorizontalAlignment(4);
        this.calcArea.setBounds(18, 6, 377, 67);
        this.getContentPane().add(this.calcArea);
        final JButton button_1 = new JButton("1"); // First button: value of 1
        button_1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_1.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_1.setBackground(Color.GREEN);
            }
        });
        button_1.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_1.setOpaque(true);
        button_1.setForeground(Color.BLACK);
        button_1.setBackground(Color.GREEN);
        button_1.addActionListener((e) -> {
            this.updateCalcArea(button_1.getText());
        });
        button_1.setBounds(35, 86, 75, 40);
        this.getContentPane().add(button_1);
        final JButton button_2 = new JButton("2"); // Button 2: Button w value of 2
        button_2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_2.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_2.setBackground(Color.GREEN);
            }
        });
        button_2.addActionListener((e) -> { // This is how by pressing the button, the user actually creates the action
            this.updateCalcArea(button_2.getText());
        });
        button_2.setOpaque(true);
        button_2.setForeground(Color.BLACK);
        button_2.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_2.setBackground(Color.GREEN);
        button_2.setBounds(122, 86, 75, 40);
        this.getContentPane().add(button_2);
        final JButton button_3 = new JButton("3");
        button_3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_3.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_3.setBackground(Color.GREEN);
            }
        });
        button_3.addActionListener((e) -> { // Third button: 3
            this.updateCalcArea(button_3.getText());
        });
        button_3.setOpaque(true);
        button_3.setForeground(Color.BLACK);
        button_3.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_3.setBackground(Color.GREEN);
        button_3.setBounds(209, 86, 75, 40);
        this.getContentPane().add(button_3);
        final JButton button_4 = new JButton("4");
        button_4.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_4.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_4.setBackground(Color.GREEN);
            }
        });
        button_4.addActionListener((e) -> { // Fourth button: 4
            this.updateCalcArea(button_4.getText());
        });
        button_4.setOpaque(true);
        button_4.setForeground(Color.BLACK);
        button_4.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_4.setBackground(Color.GREEN);
        button_4.setBounds(35, 138, 75, 40);
        this.getContentPane().add(button_4);
        final JButton button_5 = new JButton("5"); // Fifth button: 5
        button_5.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_5.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_5.setBackground(Color.GREEN);
            }
        });
        button_5.addActionListener((e) -> {
            this.updateCalcArea(button_5.getText());
        });
        button_5.setOpaque(true);
        button_5.setForeground(Color.BLACK);
        button_5.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_5.setBackground(Color.GREEN);
        button_5.setBounds(122, 138, 75, 40);
        this.getContentPane().add(button_5);
        final JButton button_6 = new JButton("6"); // Sixth button: 6
        button_6.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_6.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_6.setBackground(Color.GREEN);
            }
        });
        button_6.addActionListener((e) -> {
            this.updateCalcArea(button_6.getText());
        });
        button_6.setOpaque(true);
        button_6.setForeground(Color.BLACK);
        button_6.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_6.setBackground(Color.GREEN);
        button_6.setBounds(209, 138, 75, 40);
        this.getContentPane().add(button_6);
        final JButton button_7 = new JButton("7"); // Seventh button: 7
        button_7.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_7.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_7.setBackground(Color.GREEN);
            }
        });
        button_7.addActionListener((e) -> {
            this.updateCalcArea(button_7.getText());
        });
        button_7.setOpaque(true);
        button_7.setForeground(Color.BLACK);
        button_7.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_7.setBackground(Color.GREEN);
        button_7.setBounds(35, 190, 75, 40);
        this.getContentPane().add(button_7);
        final JButton button_8 = new JButton("8"); // Eighth button: 8
        button_8.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_8.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_8.setBackground(Color.GREEN);
            }
        });
        button_8.addActionListener((e) -> {
            this.updateCalcArea(button_8.getText());
        });
        button_8.setOpaque(true);
        button_8.setForeground(Color.BLACK);
        button_8.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_8.setBackground(Color.GREEN);
        button_8.setBounds(122, 190, 75, 40);
        this.getContentPane().add(button_8);
        final JButton button_9 = new JButton("9"); // Ninth button: 9
        button_9.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_9.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_9.setBackground(Color.GREEN);
            }
        });
        button_9.addActionListener((e) -> {
            this.updateCalcArea(button_9.getText());
        });
        button_9.setOpaque(true);
        button_9.setForeground(Color.BLACK);
        button_9.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_9.setBackground(Color.GREEN);
        button_9.setBounds(209, 190, 75, 40);
        this.getContentPane().add(button_9);
        final JButton button_0 = new JButton("0");
        button_0.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_0.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_0.setBackground(Color.GREEN);
            }
        });
        button_0.addActionListener((e) -> { // Tenth button: 0
            this.updateCalcArea(button_0.getText());
        });
        button_0.setOpaque(true);
        button_0.setForeground(Color.BLACK);
        button_0.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_0.setBackground(Color.GREEN);
        button_0.setBounds(122, 242, 75, 40);
        this.getContentPane().add(button_0);
        final JButton button_plus = new JButton("+"); // Button for addition
        button_plus.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_plus.setBackground(Color.BLACK);
            }

            public void mouseReleased(MouseEvent e) {
                button_plus.setBackground(Color.GREEN);
            }
        });
        button_plus.addActionListener((e) -> {
            this.saveValueOfArg1();
            this.saveValueOfMathOp(Math.OPERATOR.PLUS);
        });
        button_plus.setOpaque(true);
        button_plus.setForeground(Color.BLACK);
        button_plus.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_plus.setBackground(Color.GREEN);
        button_plus.setBounds(327, 138, 75, 40);
        this.getContentPane().add(button_plus);
        final JButton button_minus = new JButton("-"); // Button for subtraction
        button_minus.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_minus.setBackground(Color.BLACK);
            }

            public void mouseReleased(MouseEvent e) {
                button_minus.setBackground(Color.GREEN);
            }
        });
        button_minus.addActionListener((e) -> {
            this.saveValueOfArg1();
            this.saveValueOfMathOp(Math.OPERATOR.MINUS);
        });
        button_minus.setOpaque(true);
        button_minus.setForeground(Color.BLACK);
        button_minus.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_minus.setBackground(Color.GREEN);
        button_minus.setBounds(327, 190, 75, 40);
        this.getContentPane().add(button_minus);

// Modulus button added here by Sara
        final JButton button_modulus = new JButton("%"); // Button for modulus
        button_modulus.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_modulus.setBackground(Color.BLACK);
            }

            public void mouseReleased(MouseEvent e) {
                button_modulus.setBackground(Color.GREEN);
            }
        });
        button_modulus.addActionListener((e) -> {
            this.saveValueOfArg1();
            this.saveValueOfMathOp(Math.OPERATOR.MODULUS);
        });
        button_modulus.setOpaque(true);
        button_modulus.setForeground(Color.BLACK);
        button_modulus.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_modulus.setBackground(Color.GREEN);
        button_modulus.setBounds(327, 242, 75, 40);
        this.getContentPane().add(button_modulus);
// 327, 242, 75, 40

        final JButton button_equals = new JButton("="); // Button for equals
        button_equals.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_equals.setBackground(Color.BLACK);
            }

            public void mouseReleased(MouseEvent e) {
                button_equals.setBackground(Color.GREEN);
            }
        });
        button_equals.addActionListener((e) -> {
            this.saveValueOfArg2();
            this.calculateAnswer();
        });
        button_equals.setOpaque(true);
        button_equals.setForeground(Color.BLACK);
        button_equals.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_equals.setBackground(Color.GREEN);
        button_equals.setBounds(327, 294, 75, 40);
        this.getContentPane().add(button_equals);
        final JButton button_clear = new JButton("AC");
        button_clear.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_clear.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_clear.setBackground(Color.GREEN);
            }
        });
        button_clear.addActionListener((e) -> {
            this.clearCalculator();
        });
        button_clear.setOpaque(true);
        button_clear.setForeground(Color.BLACK);
        button_clear.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_clear.setBackground(Color.GREEN);
        button_clear.setBounds(327, 85, 75, 40);
        this.getContentPane().add(button_clear);
        JLabel lblElliesCalculator = new JLabel("DNHS Calculator");
        lblElliesCalculator.setBounds(6, 6, 134, 16);
        this.getContentPane().add(lblElliesCalculator);
    }

    private static enum STATE {
        INITIAL,
        SAVE1,
        SAVE2,
        CALC;

        private STATE() {
        }
    }
}