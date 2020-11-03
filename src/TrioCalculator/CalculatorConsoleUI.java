package TrioCalculator;
import java.util.*;

public class CalculatorConsoleUI extends CalculatorControl {
    // Initialize Scanner, and variables for user input
    private Scanner Input = new Scanner(System.in);
    private int opInput;
    private double calcAnswer;
    private CalculatorControl calcControl = new CalculatorControl();

    public CalculatorConsoleUI() {

    }

    public void setUp() {   // Initializes and Prints Console UI
        System.out.println("|-----------------------------|");
        System.out.println("|Welcome to Calculator Console|");
        System.out.println("|Please enter desired operator|");
        System.out.println("|-----------------------------|");
        System.out.println("| [0] QUIT                    |");
        System.out.println("| [1] +                       |");
        System.out.println("| [2] -                       |");
        System.out.println("| [3] x                       |");
        System.out.println("| [4] /                       |");
        System.out.println("| [5] %                       |");
        System.out.println("| [6] sin()                   |");
        System.out.println("| [7] cos()                   |");
        System.out.println("| [8] tan()                   |");
        System.out.println("| [9] ^                       |");
        System.out.println("|------------------------------");

        System.out.println("Enter Desired Operation:");
        opInput = Input.nextInt(); // User input for type of operation user wants to use

        if (opInput == 1) {   // if statements based on which operation chosen
            TwoVars();
            calcControl.saveValueOfMathOp(Math.OPERATOR.PLUS);
            calcAnswer = calcControl.calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 2) {
            TwoVars();                              // saves values of two args
            calcControl.saveValueOfMathOp(Math.OPERATOR.MINUS); // saves specific operation chosen to control and model code
            calcAnswer = calcControl.calculateAnswer();         // passes args to control, then model code, calculates and returns answer
            printAnswer();                          // Calls print function which prints returned calculated answer
            setUp();                                // Recursive function to keep calculating until exited
        }

        if (opInput == 3) {
            TwoVars();
            calcControl.saveValueOfMathOp(Math.OPERATOR.MULTIPLY);
            calcAnswer = calcControl.calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 4) {
            TwoVars();
            calcControl.saveValueOfMathOp(Math.OPERATOR.DIVIDE);
            calcAnswer = calcControl.calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 5) {
            TwoVars();
            calcControl.saveValueOfMathOp(Math.OPERATOR.MOD);
            calcAnswer = calcControl.calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 6) {
            OneVar();
            calcControl.saveValueOfMathOp(Math.OPERATOR.SIN);
            calcAnswer = calcControl.calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 7) {
            OneVar();
            calcControl.saveValueOfMathOp(Math.OPERATOR.COS);
            calcAnswer = calcControl.calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 8) {
            OneVar();
            calcControl.saveValueOfMathOp(Math.OPERATOR.TAN);
            calcAnswer = calcControl.calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 9) {
            TwoVars();
            calcControl.saveValueOfMathOp(Math.OPERATOR.POWER);
            calcAnswer = calcControl.calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 0) {     // Exit method for User to call when done
            System.out.println("Thanks for using CalculatorConsoleUI");
            System.exit(0);
        }

    }

    public void TwoVars() {
        System.out.println("Enter arg1:");      // User input for arg1
        double var1 = Input.nextDouble();
        calcControl.saveValueOfArg1(var1);                  // Sets arg1 in model code

        System.out.println("Enter arg2:");      // User input for arg2
        double var2 = Input.nextDouble();
        calcControl.saveValueOfArg2(var2);                  // Sets arg2 in model code
    }

    public void OneVar() {      // Same as above arg saving method but only one arg for single arg operations
        System.out.println("Enter arg1:");
        double var1 = Input.nextDouble();
        calcControl.saveValueOfArg1(var1);
    }

    public void printAnswer() {     // Prints calcAnswer in string using Print statement
        System.out.println("Answer: "+calcAnswer+"\n");
    }

}
