package HelloGame;

import HangbotGame.HangbotGUI;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;



public class HelloGame {

    //Have a list of the questions asked
    String[] questions =
            {
                    "Q1: What's your first name?",
                    "Q2: How are you feeling today?",
                    "Q3: What's your favorite color?",
                    "Q4: Whats your favorite animal?",
                    "Q5: Did you have fun?",
            };

    //Game loop
    public void game(){

        JFrame window = new JFrame("RoboUI");
        window.setBounds(125,125,220,350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel canvas = new HangbotGUI();
        canvas.setBackground(Color.WHITE);
        window.getContentPane().add(canvas);
        window.setVisible(true);

        //New instances of RoboPrint for robpt ascii art and scanner in order to have i/o with user
        RoboPrint roboTalk = new RoboPrint();

        Scanner scan = new Scanner(System.in);

        System.out.println("How many questions do you want? (max 5)");

        int questionsNum = scan.nextInt();

        //Resets numbers above 5 to 5 and below 0 to 0
        if (questionsNum > 5){
            questionsNum = 5;
        }
        if (questionsNum < 0){
            questionsNum = 0;
        }

        //Print the ascii art asking the questions
        roboTalk.Printy(questions);


        //Create a new list to store the answers for saving them into a file
        String[] answers = new String[questionsNum];

        //Print Q# and read answer afterward
        for (int i = 0; i < questionsNum; i++){
            System.out.println("Q"+(i+1));
            answers[i] = scan.next();
        }

        //Ask user if they want to save their answers
        System.out.println("Do you want to log the questions and your answers? y or n");

        String log = scan.next();

        if (log.equals("y")){

            System.out.println("What do you want the file name to be?");

            String filename = scan.next();

            //Try catch block required for file i/o in java
            try{
                //Creates a new file and iterates through the answers array to save the answers to the file
                FileWriter myWriter = new FileWriter(filename + ".txt");
                for (int i = 0; i < questionsNum; i++){
                    myWriter.write(questions[i] + ": " + answers[i] + "\n");

                }
                myWriter.close();
                System.out.println("Logged Succesfully");
            }
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }


        }

        System.out.println("Thanks for playing!");



    }

    public static void main(String[] args) {
        HelloGame game = new HelloGame();
        game.game();
    }
}