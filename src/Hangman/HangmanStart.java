package Hangman;

import javax.swing.*;

class HangmanStart {

    /**
    public static void main(String[] args) {
        // User input
        Scanner kboard = new Scanner(System.in);

        // RoboPrint
        RoboPrint hangman = new RoboPrint();


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

            while ((false == word.equals(wordInProgress)) && (nUsedAttempts < MAX_ATTEMPTS)){
                hangman.Printy(2*(MAX_ATTEMPTS - nUsedAttempts), wordInProgress.replaceAll("_", "_ "));
                //System.out.println(wordInProgress.replaceAll("_", "_ "));
                //System.out.print("Guess a letter: ");
                //char guess = kboard.next().charAt(0);
                char guess = Hangman.getNewLetter();
                guesses += guess;

                if (-1 != word.indexOf(guess)){
                    wordInProgress = word.replaceAll("[^" + guesses + "]" , "_");
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
     */

    public static void main(String[] args) {
        JFrame frame = new Hangman("Sanvi's Hangman");
        frame.setVisible(true);
    }
}







