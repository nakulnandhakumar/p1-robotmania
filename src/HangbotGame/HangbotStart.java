package HangbotGame;
// Created by Sanvi Pal

import java.util.Scanner;

public class HangbotStart extends HangbotPrint {

    public HangbotStart(){

    }

    public static void main(String[] args) {
        // User inh
        // put
        Scanner kboard = new Scanner(System.in);

        // RoboPrint
        HangbotPrint hangman = new HangbotPrint();


        // Word List
        String[] wordList = {"robot", "mania", "heyheyhey", "apcsa"};

        //number of  max attempts
        final int MAX_ATTEMPTS = 6;

        // choice to replay
        char choice = 'Y';

        // Loop till either word and worldInProgress match or user is out of attempts
        while ('Y' == choice){
            // Random index in World List
            int index = (int)(Math.random()*(wordList.length - 1));

            // Random word from the list
            String word = wordList[index];

            // Word in progress, start with all _
            String wordInProgress = word.replaceAll(".", "_");

            //number of attempts
            int nUsedAttempts = 0;

            // guessed letters
            String guesses = "";
            hangman.Printy();

            while ((false == word.equals(wordInProgress)) && (nUsedAttempts < MAX_ATTEMPTS)){
                hangman.Printy(2*(MAX_ATTEMPTS - nUsedAttempts));
                System.out.println(wordInProgress.replaceAll("_", "_ "));
                System.out.print("Guess a letter: ");
                char guess = kboard.next().charAt(0);

                guesses += guess;

                if (-1 != word.indexOf(guess)){
                    wordInProgress = word.replaceAll("-" + guesses + "-" , "_");
                }
                else{
                    nUsedAttempts++;
                }
            }

            if (nUsedAttempts == MAX_ATTEMPTS) {
                System.out.println("Game Over, you lost");
            }
            else {
                System.out.println("Congrats, you guessed " + word);
            }

            System.out.println("Do you want to play again...Y/N?");
            choice = kboard.next().charAt(0);
        }
    }
}

