package ConnectFourGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConnectFourGUI extends JFrame implements ActionListener { // These are the panels/buttons/components of the swing design
    private ConnectFourAlgorithm game;
    private JPanel panel1; // Main panel
    private JButton a1Button; // Buttons (1-7)
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JPanel r1c1; // Individual panels for game board
    private JPanel r1c2;
    private JPanel r1c3;
    private JPanel r1c4;
    private JPanel r1c5;
    private JPanel r1c6;
    private JPanel r1c7;
    private JPanel r2c1;
    private JPanel r2c2;
    private JPanel r2c3;
    private JPanel r2c4;
    private JPanel r2c5;
    private JPanel r2c6;
    private JPanel r2c7;
    private JPanel r3c3;
    private JPanel r3c1;
    private JPanel r3c2;
    private JPanel r3c4;
    private JPanel r3c5;
    private JPanel r3c6;
    private JPanel r3c7;
    private JPanel r4c1;
    private JPanel r4c2;
    private JPanel r4c3;
    private JPanel r4c4;
    private JPanel r4c5;
    private JPanel r4c6;
    private JPanel r4c7;
    private JPanel r5c1;
    private JPanel r5c2;
    private JPanel r5c3;
    private JPanel r5c4;
    private JPanel r5c5;
    private JPanel r5c6;
    private JPanel r5c7;
    private JPanel r6c1;
    private JPanel r6c2;
    private JPanel r6c3;
    private JPanel r6c4;
    private JPanel r6c5;
    private JPanel r6c6;
    private JPanel r6c7;
    private JLabel textOutput; // Where player turn/win are kept record of
    private JPanel grid;
    private JPanel buttons;
    private JPanel output;

    public ConnectFourGUI() { // Action listeners for buttons
        a1Button.addActionListener(new ButtonClicked());
        a2Button.addActionListener(new ButtonClicked());
        a3Button.addActionListener(new ButtonClicked());
        a4Button.addActionListener(new ButtonClicked());
        a5Button.addActionListener(new ButtonClicked());
        a6Button.addActionListener(new ButtonClicked());
        a7Button.addActionListener(new ButtonClicked());
        game = new ConnectFourAlgorithm();
        grid.setVisible(true);
        textOutput.setText("Player 1 Turn"); // Initializes player turn
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) { // Main: initializes board
        JFrame frame = new JFrame("Connect Four");
        frame.setContentPane(new ConnectFourGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }

    public class ButtonClicked implements ActionListener { // This is the code for what happens when the button is clicked

        public int row;

        @Override
        public void actionPerformed(ActionEvent e) {
            Object button = e.getSource();
            if (button == a1Button) {
                row = game.markBoard(0);
                markGrid(row, 1, game.getPlayerOneTurn());
            }
            if (button == a2Button) {
                row = game.markBoard(1);
                markGrid(row, 2, game.getPlayerOneTurn());
            }
            if (button == a3Button) {
                row = game.markBoard(2);
                markGrid(row, 3, game.getPlayerOneTurn());
            }
            if (button == a4Button) {
                row = game.markBoard(3);
                markGrid(row, 4, game.getPlayerOneTurn());
            }
            if (button == a5Button) {
                row = game.markBoard(4);
                markGrid(row, 5, game.getPlayerOneTurn());
            }
            if (button == a6Button) {
                row = game.markBoard(5);
                markGrid(row, 6, game.getPlayerOneTurn());
            }
            if (button == a7Button) {
                row = game.markBoard(6);
                markGrid(row, 7, game.getPlayerOneTurn());
            }
        }

        private void markGrid(int row, int col, boolean p1Turn) { // This establishes how the gird is marked using ternary operators; yellow is player 1 and red is player 2
            if (col == 1) {
                if (row == 5) {
                    r6c1.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 4) {
                    r5c1.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 3) {
                    r4c1.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 2) {
                    r3c1.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 1) {
                    r2c1.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 0) {
                    r1c1.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
            } else if (col == 2) {
                if (row == 5) {
                    r6c2.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 4) {
                    r5c2.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 3) {
                    r4c2.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 2) {
                    r3c2.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 1) {
                    r2c2.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 0) {
                    r1c2.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
            }
            else if (col == 3) {
                if (row == 5) {
                    r6c3.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 4) {
                    r5c3.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 3) {
                    r4c3.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 2) {
                    r3c3.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 1) {
                    r2c3.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 0) {
                    r1c3.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
            }
            else if (col == 4) {
                if (row == 5) {
                    r6c4.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 4) {
                    r5c4.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 3) {
                    r4c4.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 2) {
                    r3c4.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 1) {
                    r2c4.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 0) {
                    r1c4.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
            }
            else if (col == 5) {
                if (row == 5) {
                    r6c5.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 4) {
                    r5c5.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 3) {
                    r4c5.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 2) {
                    r3c5.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 1) {
                    r2c5.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 0) {
                    r1c5.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
            }
            else if (col == 6) {
                if (row == 5) {
                    r6c6.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 4) {
                    r5c6.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 3) {
                    r4c6.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 2) {
                    r3c6.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 1) {
                    r2c6.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 0) {
                    r1c6.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
            }
            else if (col == 7) {
                if (row == 5) {
                    r6c7.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 4) {
                    r5c7.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 3) {
                    r4c7.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 2) {
                    r3c7.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 1) {
                    r2c7.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
                if (row == 0) {
                    r1c7.setBackground(p1Turn ? Color.YELLOW : Color.RED);
                }
            }
            if (game.checkForWin()) { // This shows the final screen when the algorithm declares a win; buttons are disabled
                textOutput.setText("Game Over! " + (game.getPlayerOneTurn() ? " Player 1 Wins!" : " Player 2 Wins!"));
                a1Button.setEnabled(false);
                a2Button.setEnabled(false);
                a3Button.setEnabled(false);
                a4Button.setEnabled(false);
                a5Button.setEnabled(false);
                a6Button.setEnabled(false);
                a7Button.setEnabled(false);
            }
            else {
                textOutput.setText(game.getPlayerOneTurn() ? "Player 1 Turn" : "Player 2 Turn"); // If there is no win, the turn alternates
            }
            game.setPlayerOneTurn();
        }
    }
}
