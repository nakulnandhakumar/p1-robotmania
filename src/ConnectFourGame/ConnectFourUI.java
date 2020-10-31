package ConnectFourGame;

import SanviSaraCalculator.CalculatorUI;
import TrioCalculator.CalculatorGUI;

import javax.swing.*;
import java.awt.*;

public class ConnectFourUI
{
    public static void main(String[] args) {
        JFrame connectGUI = new JFrame("CalculatorGUI");
        connectGUI.setContentPane(new ConnectFourGUI().panel1);
        connectGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        connectGUI.pack();
        connectGUI.setVisible(true);
    }
}
