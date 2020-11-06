package Main;

import BattleshipGame.*;
import ConnectFourGame.ConnectFourUI;
import HelloGame.*;
import SanviSaraCalculator.CalculatorUI;
import SanviSaraCalculator.ConsoleBasedUI;
import TrioCalculator.*;
import HangbotGame.*;
import BubbleSort.*;
import OldReplCode.*;

import javax.swing.*;
import java.awt.*;

//image reading
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;

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

    private JLabel welcome_image;
    private ImageIcon robotImage;
    private String projectPath;




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

        {
            try {
               projectPath = new File(".").getCanonicalPath();
            } catch (IOException e) {
                System.out.println("bruh");
            }
        }
        robotImage = new ImageIcon(projectPath.toString()+"\\images.png");

        if (robotImage != null) {
            System.out.println("images.png exists");
        }
        welcome_image = new JLabel();
        welcome_image.setPreferredSize(new Dimension(50,50));
        welcome_image.setIcon(robotImage);


        setTitle("P1-RobotMania");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        // JLabel with image
        JLabel pic = new JLabel("");
        pic.setIcon(new ImageIcon(projectPath.toString() + "\\src\\compsci.jpg"));
        pic.setPreferredSize(new Dimension(50,50));
        //pic.setBounds(377, 111, 128, 128);

        // Content Panel to add Label and Image
        Container content = getContentPane();
        content.setBackground(new Color(147,200,230));
        //content.add(welcome_image);
        content.add(pic);

        // Menu Objects
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
/** -----------------------------------------------------------------**/
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
/** -----------------------------------------------------------------**/
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
/** -----------------------------------------------------------------**/
        JMenu menuHelloGame = new JMenu("HelloGameSuite");
        menuBar.add(menuHelloGame);

        JMenuItem menuItemHelloGame = new JMenuItem("HelloGame");
        menuItemHelloGame.addActionListener(e -> {
            HelloGame.main(null);
        });
        menuHelloGame.add(menuItemHelloGame);

        JMenuItem menuItemRoboPrint = new JMenuItem("RobotPrint");
        menuItemRoboPrint.addActionListener(e -> {
            RoboPrint.main(null);
        });
        menuHelloGame.add(menuItemRoboPrint);
/** -----------------------------------------------------------------**/
        JMenu menuBubbleSort = new JMenu("BubbleSort");
        menuBar.add(menuBubbleSort);

        JMenuItem menuItemStudent = new JMenuItem("BubbleSort");
        menuItemStudent.addActionListener(e -> {
            Student.main(null);
        });
        menuBubbleSort.add(menuItemStudent);
/** -----------------------------------------------------------------**/
        JMenu menuReplCode = new JMenu("Old Repl Code");
        menuBar.add(menuReplCode);

        JMenuItem menuItemRobotBank = new JMenuItem("Robot Bank");
        menuItemRobotBank.addActionListener(e -> {
            RobotBank.main(null);
        });
        menuReplCode.add(menuItemRobotBank);

        JMenuItem menuItemRoboScramble = new JMenuItem("Robo Scramble");
        menuItemRoboScramble.addActionListener(e -> {
            RoboScramble.main(null);
        });
        menuReplCode.add(menuItemRoboScramble);

        JMenuItem menuItemMadlibs = new JMenuItem("Madlibs");
        menuItemMadlibs.addActionListener(e -> {
            Madlibs.main(null);
        });
        menuReplCode.add(menuItemMadlibs);

        JMenuItem menuItemLoopy = new JMenuItem("Loopy");
        menuItemLoopy.addActionListener(e -> {
            Loopy.main(null);
        });
        menuReplCode.add(menuItemLoopy);
/** -----------------------------------------------------------------**/
    }

    public void terminate(JFrame game) {
        game.dispose();
    }
}


