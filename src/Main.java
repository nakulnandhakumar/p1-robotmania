import BattleshipGame.*;
import ConnectFourGame.ConnectFourUI;
import HelloGame.*;
import SanviSaraCalculator.CalculatorUI;
import SanviSaraCalculator.ConsoleBasedUI;
import TrioCalculator.*;
import HangbotGame.*;

import javax.swing.*;
import java.awt.*;

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
    private JButton ConnectFourButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Main frame = new Main();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Main() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        // JLabel with image
        JLabel pic = new JLabel("");
        java.awt.Image image = new ImageIcon("compsci.jpeg").getImage();
        pic.setIcon(new ImageIcon(image));
        pic.setBounds(377, 111, 128, 128);

        // Content Panel to add Label and Image
        Container content = getContentPane();
        content.setBackground(new Color(147,200,230));
        content.add(pic);

        // Menu Objects
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuGames = new JMenu("Games");
        menuBar.add(menuGames);

        JMenuItem menuItemBattleship = new JMenuItem("Battleship");
        menuItemBattleship.addActionListener(e -> {
            BattleshipControl.main(null);
        });
        menuGames.add(menuItemBattleship);

        JMenuItem menuItemConnect4 = new JMenuItem("Connect4");
        menuItemConnect4.addActionListener(e -> {
            ConnectFourUI.main(null);
        });
        menuGames.add(menuItemConnect4);

        JMenuItem menuItemHangbot = new JMenuItem("Hangbot");
        menuItemHangbot.addActionListener(e -> {
            HangbotStart.main(null);
        });
        menuGames.add(menuItemHangbot);

        JMenu menuCalc = new JMenu("Calculators");
        menuBar.add(menuCalc);

        JMenuItem menuItemTrioCalculator = new JMenuItem("TrioCalculator");
        menuItemTrioCalculator.addActionListener(e -> {
            CalculatorControl.main(null);
        });
        menuCalc.add(menuItemTrioCalculator);

        JMenuItem menuItemSaraSanviCalcGUI = new JMenuItem("SaraSanviCalcGUI");
        menuItemSaraSanviCalcGUI.addActionListener(e -> {
            CalculatorUI.main(null);
        });
        menuCalc.add(menuItemSaraSanviCalcGUI);

        JMenuItem menuItemSaraSanviCalcConsole = new JMenuItem("SaraSanviCalcConsole");
        menuItemSaraSanviCalcConsole.addActionListener(e -> {
            ConsoleBasedUI.main(null);
        });
        menuCalc.add(menuItemSaraSanviCalcConsole);

        JMenu menuHelloGame = new JMenu("HelloGameStuff");
        menuBar.add(menuHelloGame);

        JMenuItem menuItemHelloGame = new JMenuItem("HelloGame");
        menuItemHelloGame.addActionListener(e -> {
            HelloGame.main(null);
        });
        menuHelloGame.add(menuItemHelloGame);

        JMenuItem menuIteRoboPrint = new JMenuItem("HelloGame");
        menuIteRoboPrint.addActionListener(e -> {
            RoboPrint.main(null);
        });
        menuHelloGame.add(menuIteRoboPrint);

    }
}


