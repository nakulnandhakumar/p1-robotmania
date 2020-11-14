package Main;

import BattleshipGame.*;
import ConnectFourGame.ConnectFourGUI;
import HelloGame.*;
import SanviSaraCalculator.CalculatorUI;
import SanviSaraCalculator.ConsoleBasedUI;
import TrioCalculator.*;
import Hangman.*;
import OldReplCode.*;
import BubbleSort.*;


import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame {

    private JLabel welcome_image;
    private ImageIcon robotImage;
    private String projectPath;

    private String imagePath = "src\\compsci.jpg";

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {      // Main method instantiates main GUI for user to choose project files from
            try {
                Main frame = new Main();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Main() {
        // JLabel with image
        {
            try {
                projectPath = new File(".").getCanonicalPath();
            } catch (IOException e) {
                System.out.println("bruh");
             }
        }

        // Content Panel to add Label and Imagea
        robotImage = new ImageIcon(projectPath.toString()+"\\src\\compsci.jpg");

        if (robotImage != null) {
            System.out.println("images.png exists");
        }

        welcome_image = new JLabel();
        welcome_image.setIcon(robotImage);

        Container content = getContentPane();
        content.setBackground(new Color(147,200,230));
        content.add(welcome_image);

        setTitle("P1-RobotMania");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);



        // Adds Menu Bar to Main Menu GUI
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

/** -----------------------------------------------------------------**/
        // Adds MenuDropDown to main menu bar for Games
        JMenu menuGames = new JMenu("Games");
        menuBar.add(menuGames);

        // Adds MenuItem for Battleship Game file
        JMenuItem menuItemBattleship = new JMenuItem("Battleship");
        menuItemBattleship.addActionListener(e -> {
            BattleshipControl.main(null);
        });
        menuGames.add(menuItemBattleship);

        // Adds MenuItem for Connect4 Game file
        JMenuItem menuItemConnect4 = new JMenuItem("Connect4");
        menuItemConnect4.addActionListener(e -> {
            ConnectFourGUI.main(null);
        });
        menuGames.add(menuItemConnect4);

        // Adds MenuItem for Hangman Game file
        JMenuItem menuItemHangman = new JMenuItem("Hangman");
        menuItemHangman.addActionListener(e -> {
            Hangman.main(null);
        });
        menuGames.add(menuItemHangman);
/** -----------------------------------------------------------------**/

        // Adds MenuDropDown to main menu bar for Calculator Projects
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

        // Adds MenuDropDown to main menu bar for initial HelloGame code
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

/** -----------------------------------------------------------------**/
        // Adds MenuDropDown to main menu bar for BubbleSort code
        JMenu menuBubbleSort = new JMenu("BubbleSort");
        menuBar.add(menuBubbleSort);

        JMenuItem menuItemStudent = new JMenuItem("BubbleSort");
        menuItemStudent.addActionListener(e -> {
            Student.main(null);
        });
        menuBubbleSort.add(menuItemStudent);
/** -----------------------------------------------------------------**/
        // Adds MenuDropDown to main menu bar for Old Repl Portfolio code
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
}


