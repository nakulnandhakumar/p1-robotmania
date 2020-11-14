package SanviSaraCalculator;

// Calculator Main created by Sara Beniwal

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to run the GUI version or the console version of the calculator? Enter 1 for GUI or 2 for console.");
        int choice = keyboard.nextInt();

        if(choice == 1){
            CalculatorGUI.main(null);
        }
        else{
            ConsoleBasedUI.main(null);
        }
    }
}
