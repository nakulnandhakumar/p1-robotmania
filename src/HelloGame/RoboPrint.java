
// Created by Yasaswi Singamneni

package HelloGame;

public class RoboPrint {


    public final String ANSI_GREEN = "\u001B[32m";
    public final String ANSI_RESET = "\u001B[0m";
    public final String ANSI_RED = "\u001B[31m";

    //Create ascii art string as 2D array
    //2D beacuse we initally considered having multiple robots
    //Could be regular array
    String[][] robot = {

            {"       _           |",
                    "      [ ]          |",
                    "     (. .)         |",
                    "      |>|          |",
                    "   __/===\\__       |",
                    "  //| o=o |\\\\      |",
                    "<]  | o=o |  [>    |",
                    "   / / | \\ \\       |",
                    "    \\=====/        |",
                    "   <_______>       |",
                    "                   |",
                    "                   |",
                    "                   |",
            },
    };


    //Loops through each row in the 2D array
    public void Printy(String[] p_lines) {

        for (int i = 0; i < robot[0].length; i++){
            if (p_lines.length >= i+1){
                //Sets cursor to green, prints robot, sets cursor to red, prints text, then resets cursor for next line
                System.out.println(ANSI_GREEN + robot[0][i] + ANSI_RED + p_lines[i]+ANSI_RESET);
            } else {
                System.out.println(ANSI_GREEN + robot[0][i]+ANSI_RESET);
            }
        }
    }
    //Same as before but uses function overloading to only print robot for hangman
    public void Printy(int nLines) {

        for (int i = 0; i < robot[0].length && 0 != nLines; i++) {
            System.out.println(ANSI_GREEN + robot[0][i] + ANSI_RESET);
            nLines--;
        }

    }
    public static void main(String[] args) {
       System.out.println("Hello");

    }

}