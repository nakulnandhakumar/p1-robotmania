package Hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hangman extends JFrame{
    private JPanel mainPanel;
    private JLabel RobotIcon;
    private JLabel WordProgress;
    private JLabel Guess;
    private JTextField Letter;

    private char guess;

    // Word List
    private String[] wordList = {"robot", "mania", "heyheyhey", "apcsa"};

    // number of  max attempts
    private final int MAX_ATTEMPTS = 5;

    // used attempts
    private int nUsedAttempts;

    // Word
    private String word;

    // World in progress
    private String wordInProgress;

    // Guessed Letters
    String guesses;


    public Hangman(String title){
        super(title);

        // Random word from the list
        word = wordList[(int)(Math.random()*(wordList.length - 1))];

        // Word in progress, start with all _
        wordInProgress = word.replaceAll(".", "_");

        //number of attempts
        nUsedAttempts = 0;

        // guessed letters
        guesses = "";

        WordProgress.setText(wordInProgress.replaceAll("_", "_ "));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        Letter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guess = Letter.getText().charAt(0);
                repaintHangmanUI();
            }
        });
    }

    private void repaintHangmanUI(){
        if ((false == word.equals(wordInProgress)) && (nUsedAttempts < MAX_ATTEMPTS)) {
            guesses += guess;

            if (-1 != word.indexOf(guess)) {
                wordInProgress = word.replaceAll("[^" + guesses + "]", "_");
            } else {
                nUsedAttempts++;
            }

            WordProgress.setText(wordInProgress.replaceAll("_", "_ "));

            switch (MAX_ATTEMPTS - nUsedAttempts) {
                case (5):
                    RobotIcon.setIcon(new ImageIcon("C:\\Users\\sanvi\\IdeaProjects\\Hangman\\src\\image100.png"));
                    if (true == word.equals(wordInProgress)) {
                        Letter.setText("You Won!!!");
                    }
                    else {
                        Letter.setText("");
                    }
                    break;
                case (4):
                    RobotIcon.setIcon(new ImageIcon("C:\\Users\\sanvi\\IdeaProjects\\Hangman\\src\\image80.png"));
                    if (true == word.equals(wordInProgress)) {
                        Letter.setText("You Won!!!");
                    }
                    else {
                        Letter.setText("");
                    }
                    Letter.setText("");
                    break;
                case (3):
                    RobotIcon.setIcon(new ImageIcon("C:\\Users\\sanvi\\IdeaProjects\\Hangman\\src\\image60.png"));
                    if (true == word.equals(wordInProgress)) {
                        Letter.setText("You Won!!!");
                    }
                    else {
                        Letter.setText("");
                    }
                    Letter.setText("");
                    break;
                case (2):
                    RobotIcon.setIcon(new ImageIcon("C:\\Users\\sanvi\\IdeaProjects\\Hangman\\src\\image40.png"));
                    if (true == word.equals(wordInProgress)) {
                        Letter.setText("You Won!!!");
                    }
                    else {
                        Letter.setText("");
                    }
                    Letter.setText("");
                    break;
                case (1):
                    RobotIcon.setIcon(new ImageIcon("C:\\Users\\sanvi\\IdeaProjects\\Hangman\\src\\image20.png"));
                    if (true == word.equals(wordInProgress)) {
                        Letter.setText("You Won!!!");
                    }
                    else {
                        Letter.setText("");
                    }
                    Letter.setText("");
                    break;
                default:
                    RobotIcon.setIcon(new ImageIcon("C:\\Users\\sanvi\\IdeaProjects\\Hangman\\src\\image00.png"));
                    Letter.setText("You LOST!!!");
                    break;
            }
        }
    }
}
