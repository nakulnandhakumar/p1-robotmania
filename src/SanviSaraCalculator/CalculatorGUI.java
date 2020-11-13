package SanviSaraCalculator;
 //Calculator GUI
 //By Sara Beniwal


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CalculatorGUI extends JFrame {
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
    private JButton addButton;
    private JButton subButton;
    private JButton modButton;
    private JButton divideButton;
    private JButton multiplyButton;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton cotButton;
    private JButton cscButton;
    private JButton secButton;
    private JButton equalsButton;
    private JButton clearButton;
    private JPanel calculator;
    private JLabel calcArea;
    private JLabel calcInput;
    private ArrayList<String> expression = new ArrayList<>();
    private ArrayList<String> operators = new ArrayList<>(Arrays.asList(" ", "+", "-", "x", "/", "mod", "^", "sqrt", "sin", "cos", "tan", "cot", "csc", "sec"));


    public static void main(String[] args) {
        JFrame frame = new JFrame("Sara's Calculator");
        frame.setContentPane(new CalculatorGUI().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(750, 750);
        frame.setVisible(true);
    }


   private void updateCalcArea(String string) {
        if(expression.size() > 0) {
            char currentDigit = string.charAt(0);
            String lastEntry = expression.get(expression.size()-1);
            char lastDigit = lastEntry.charAt(lastEntry.length()-1);

            if((currentDigit >= '0' && currentDigit <= '9') && (lastDigit >= '0' && lastDigit <= '9')) {
                expression.set(expression.size()-1, lastEntry + string);
            }
            else {
                expression.add(string);
            }
        }
        else {
            expression.add(string);
        }
        calcInput.setText(stringArray());
    }

    private String stringArray(){
        String array = "";
        for(int i = 0; i<expression.size(); i++){
            array += expression.get(i);
        }
        return array.toString();
    }

    public CalculatorGUI(){

        a1Button.addActionListener((e) -> updateCalcArea(a1Button.getText()));
        a2Button.addActionListener((e) -> updateCalcArea(a2Button.getText()));
        a3Button.addActionListener((e) -> updateCalcArea(a3Button.getText()));
        a4Button.addActionListener((e) -> updateCalcArea(a4Button.getText()));
        a5Button.addActionListener((e) -> updateCalcArea(a5Button.getText()));
        a6Button.addActionListener((e) -> updateCalcArea(a6Button.getText()));
        a7Button.addActionListener((e) -> updateCalcArea(a7Button.getText()));
        a8Button.addActionListener((e) -> updateCalcArea(a8Button.getText()));
        a9Button.addActionListener((e) -> updateCalcArea(a9Button.getText()));
        a0Button.addActionListener((e) -> updateCalcArea(a0Button.getText()));
        addButton.addActionListener((e) -> updateCalcArea(addButton.getText()));
        subButton.addActionListener((e) -> updateCalcArea(subButton.getText()));
        modButton.addActionListener((e) -> updateCalcArea(modButton.getText()));
        divideButton.addActionListener((e) -> updateCalcArea(divideButton.getText()));
        multiplyButton.addActionListener((e) -> updateCalcArea(multiplyButton.getText()));
        sinButton.addActionListener((e) -> updateCalcArea(sinButton.getText()));
        cosButton.addActionListener((e) -> updateCalcArea(cosButton.getText()));
        tanButton.addActionListener((e) -> updateCalcArea(tanButton.getText()));
        cotButton.addActionListener((e) -> updateCalcArea(cotButton.getText()));
        cscButton.addActionListener((e) -> updateCalcArea(cscButton.getText()));
        secButton.addActionListener((e) -> updateCalcArea(secButton.getText()));
        equalsButton.addActionListener((e) -> calculate());
        clearButton.addActionListener((e) -> clearCalcArea());


    }

    private void clearCalcArea() {
        expression.clear();
        calcArea.setText(" ");
        calcInput.setText(" ");
    }

    private void calculate() {
        double result;
        if(expression.size() < 3) {
            result = new CalculatorOperations(Integer.parseInt(expression.get(0)),
                    operators.indexOf(expression.get(1))).getResult();
        }
        else {
            result = new CalculatorOperations(Integer.parseInt(expression.get(0)),
                    Integer.parseInt(expression.get(2)),
                    operators.indexOf(expression.get(1))).getResult();
        }
        calcArea.setText(String.valueOf(result));
    }

}







