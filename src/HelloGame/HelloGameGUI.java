package HelloGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class HelloGameGUI extends JFrame{
    private JLabel RobotIcon;
    private JLabel WordProgress;
    private JLabel Guess;
    private JTextField Letter;
    private JPanel mainPanel;



    String[] ans = new String[5];




    private String[] questions =
            {
                    "Q1: What's your first name?",
                    "Q2: How are you feeling today?",
                    "Q3: What's your favorite color?",
                    "Q4: Whats your favorite animal?",
                    "Q5: Did you have fun?",
            };




    //stores which question the user is on
    private int questionnum;


    public HelloGameGUI(String title){
        super(title);

        questionnum = 0;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        //activates everytime the user clicks enter
        Letter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (questionnum < 5){
                    //stores answer in an array for logging later
                    ans[questionnum] = Letter.getText();
                }
                next();
            }
        });
    }

    private void next(){

        //increments what question the user is on
        questionnum++;


        switch (questionnum) {

            //on "case" or question 2
            //not q1 because q1 is already displayed as default
            case (1):
                WordProgress.setText(questions[1]);
                Guess.setText("Enter answer for q2");
                Letter.setText("");
                break;

            //on "case" or question 3
            case (2):
                WordProgress.setText(questions[2]);
                Guess.setText("Enter answer for q3");
                Letter.setText("");
                break;

            //on "case" or question 4
            case (3):
                WordProgress.setText(questions[3]);
                Guess.setText("Enter answer for q4");
                Letter.setText("");
                break;

            //on "case" or question 5
            case (4):
                WordProgress.setText(questions[4]);
                Guess.setText("Enter answer for q5");
                Letter.setText("");
                break;

            //on "case" or asking if the user wants to save their answer
            case (5):
                WordProgress.setText("Do you want to save your answers?");
                Letter.setText("");
                Guess.setText("Enter answer as Y to save");
                break;

            //on case 6, saving the answers
            case (6):
                if (Letter.getText().equals("y")){
                    try{
                        //Creates a new file and iterates through the answers array to save the answers to the file
                        FileWriter myWriter = new FileWriter("answers.txt");
                        for (int i = 0; i < ans.length; i++){
                            myWriter.write(questions[i] + ": " + ans[i] + "\n");

                        }
                        myWriter.close();
                        System.out.println("Logged Succesfully");
                    }
                    catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }

                } else {
                    System.out.println(Letter.getText().equals("y"));
                }

            default:
                WordProgress.setText("Have fun!");
                Guess.setText("Thanks for Playing");
                Letter.setText("");


        }
    }

    //main function for testing
    public static void main(String[] args) {
        JFrame frame = new HelloGameGUI("HelloGame");
        frame.setVisible(true);
    }

}
