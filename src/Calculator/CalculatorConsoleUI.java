package Calculator;
import java.util.*;

public class CalculatorConsoleUI extends CalculatorControl {

    private Scanner Input = new Scanner(System.in);
    private int opInput;


    public CalculatorConsoleUI(){

    }

    public void setUp() {
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
        opInput = Input.nextInt();

        if (opInput == 1) {
            TwoVars();
            saveValueOfMathOp(Math.OPERATOR.PLUS);
            calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 2) {
            TwoVars();
            saveValueOfMathOp(Math.OPERATOR.MINUS);
            calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 3) {
            TwoVars();
            saveValueOfMathOp(Math.OPERATOR.MULTIPLY);
            calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 4) {
            TwoVars();
            saveValueOfMathOp(Math.OPERATOR.DIVIDE);
            calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 5) {
            TwoVars();
            saveValueOfMathOp(Math.OPERATOR.MOD);
            calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 6) {
            OneVar();
            saveValueOfMathOp(Math.OPERATOR.SIN);
            calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 7) {
            OneVar();
            saveValueOfMathOp(Math.OPERATOR.COS);
            calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 8) {
            OneVar();
            saveValueOfMathOp(Math.OPERATOR.TAN);
            calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 9) {
            TwoVars();
            saveValueOfMathOp(Math.OPERATOR.POWER);
            calculateAnswer();
            printAnswer();
            setUp();
        }

        if (opInput == 0) {
            System.out.println("Thanks for using CalculatorConsoleUI");
            System.exit(0);
        }

    }

    public void TwoVars() {
        System.out.println("Enter arg1:");
        arg1 = Input.nextDouble();

        System.out.println("Enter arg2:");
        arg2 = Input.nextDouble();
    }

    public void OneVar() {
        System.out.println("Enter arg1:");
        arg1 = Input.nextDouble();
    }

    public void printAnswer(){
        System.out.println("Answer: "+calcAnswer+"\n");
    }

    public static void main(String[] args) {
        CalculatorConsoleUI calculatorConsole = new CalculatorConsoleUI();
        calculatorConsole.setUp();
    }

}
