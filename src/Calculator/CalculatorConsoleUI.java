package Calculator;
import java.util.*;

public class CalculatorConsoleUI {

    public double arg1;
    public double arg2;
    private Scanner Input = new Scanner(System.in);
    private int opInput;


    public CalculatorConsoleUI(){

    }

    public void setUp() {
        System.out.println("|-----------------------------|");
        System.out.println("|Welcome to Calculator Console|");
        System.out.println("|Please enter desired operator|");
        System.out.println("|-----------------------------|");
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
        }

        if (opInput == 2) {
            TwoVars();
        }

        if (opInput == 3) {
            TwoVars();
        }

        if (opInput == 4) {
            TwoVars();
        }

        if (opInput == 5) {
            TwoVars();
        }

        if (opInput == 6) {
            OneVar();
        }

        if (opInput == 7) {
            OneVar();
        }

        if (opInput == 8) {
            OneVar();
        }

        if (opInput == 9) {
            TwoVars();
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

    public static void main(String[] args) {
        CalculatorConsoleUI calculatorConsole = new CalculatorConsoleUI();
        calculatorConsole.setUp();
    }

}
