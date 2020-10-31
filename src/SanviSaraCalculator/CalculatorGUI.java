package SanviSaraCalculator; /**
 * Calculator 2.0
 * By Sara B. and Sanvi P.
 * Current Progress: GUI for Calculator is made and Buttons are initialized with action listener
 *
 */


import javax.swing.*;

public class CalculatorGUI extends JFrame {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("CalculatorGUI");
        jframe.setContentPane(new CalculatorGUI().panel1);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
    }
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton xButton;
    private JButton equalsButton;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton cotButton;
    private JButton cscButton;
    private JButton secButton;
    private JPanel panel1;
    private JTextField calcArea = new JTextField("");

    private boolean initialCalcAreaInputState;
    String expression="";




    private void updateCalcArea(String string) {
        expression += string;
        this.calcArea.setText(string);
        //this.initialCalcAreaInputState = false;
    }
      /*  else {
            JTextField var10000 = this.calcArea;
            String var10001 = this.calcArea.getText();
            var10000.setText(var10001 + string);
        } */

    //initialized method
    public CalculatorGUI(){

        a1Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        a2Button.addActionListener((e) -> {
            this.updateCalcArea(a2Button.getText());
        });
        a3Button.addActionListener((e) -> {
            this.updateCalcArea(a3Button.getText());
        });
        a4Button.addActionListener((e) -> {
            this.updateCalcArea(a4Button.getText());
        });
        a5Button.addActionListener((e) -> {
            this.updateCalcArea(a5Button.getText());
        });
        a6Button.addActionListener((e) -> {
            this.updateCalcArea(a6Button.getText());
        });
        a7Button.addActionListener((e) -> {
            this.updateCalcArea(a7Button.getText());
        });
        a8Button.addActionListener((e) -> {
            this.updateCalcArea(a8Button.getText());
        });
        a9Button.addActionListener((e) -> {
            this.updateCalcArea(a9Button.getText());
        });
        a0Button.addActionListener((e) -> {
            this.updateCalcArea(a0Button.getText());
        });
        button11.addActionListener((e) -> {
            this.updateCalcArea(button11.getText());
        });
        button12.addActionListener((e) -> {
            this.updateCalcArea(button12.getText());
        });
        button13.addActionListener((e) -> {
            this.updateCalcArea(button13.getText());
        });
        button14.addActionListener((e) -> {
            this.updateCalcArea(button14.getText());
        });
        xButton.addActionListener((e) -> {
            this.updateCalcArea(xButton.getText());
        });
        equalsButton.addActionListener((e) -> {
            this.updateCalcArea(equalsButton.getText());
        });
        sinButton.addActionListener((e) -> {
            this.updateCalcArea(sinButton.getText());
        });
        cosButton.addActionListener((e) -> {
            this.updateCalcArea(cosButton.getText());
        });
        tanButton.addActionListener((e) -> {
            this.updateCalcArea(tanButton.getText());
        });
        cotButton.addActionListener((e) -> {
            this.updateCalcArea(cotButton.getText());
        });
        cscButton.addActionListener((e) -> {
            this.updateCalcArea(cscButton.getText());
        });
        secButton.addActionListener((e) -> {
            this.updateCalcArea(secButton.getText());
        });


    }


}









