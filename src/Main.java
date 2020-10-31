import BattleshipGame.*;
import HelloGame.*;
import SanviSaraCalculator.CalculatorUI;
import SanviSaraCalculator.ConsoleBasedUI;
import TrioCalculator.*;
import HangbotGame.*;

import javax.swing.*;

public class Main extends JFrame {
    private JButton Battleship;
    private JPanel panel1;
    private JButton Hangbot;
    private JButton TrioCalculator;
    private JButton Sara_Sanvi_CalcGUI;
    private JButton RoboPrintButton;
    private JButton HelloGameButton;
    private JButton Sara_Sanvi_CalcConsole;
    private JLabel mainLabel;

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
        TrioCalculator.addActionListener(e -> {
            CalculatorContrl.main(null);
        });
        RoboPrintButton.addActionListener(e -> {
            RoboPrint.main(null);
        });
        HelloGameButton.addActionListener(e -> {
            HelloGame.main(null);
        });
        Sara_Sanvi_CalcGUI.addActionListener(e -> {
            CalculatorUI.main(null);
        });
        Sara_Sanvi_CalcConsole.addActionListener(e -> {
            ConsoleBasedUI.main(null);
        });
        Hangbot.addActionListener(e -> {
            HangbotStart.main(null);
        });
    }
}
