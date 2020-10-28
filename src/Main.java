import BattleshipGame.*;
import TrioCalculator.*;
import HelloGame.*;

import javax.swing.*;

public class Main extends JFrame {
    private JButton Battleship;
    private JPanel panel1;
    private JButton HelloGame;
    private JButton Hangbot;
    private JButton Calculator;

    public static void main(String[] args) {
        Main main = new Main();
        JFrame frame = new JFrame("Menu");     // instantiates frame object and uses it activate GUI
        frame.setContentPane(main.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true); // actually makes the view pop up on a window
    }

    public Main() {
        Battleship.addActionListener(e -> {
            BattleshipGUI.main(null);
        });
        Calculator.addActionListener(e -> {
            CalculatorContrl.main(null);
        });
        HelloGame.addActionListener(e -> {
            RoboPrint.main(null);
        });
    }
}
