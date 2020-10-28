package TrioCalculator;
import java.util.*;

public class CalculatorConsoleUI extends CalculatorContrl {

    private Scanner Input = new Scanner(System.in);
    private int opInput;
    private double calcAnswer;

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
            model.setMathOp(Math.OPERATOR.PLUS);
            calcAnswer = model.calculate();
            printAnswer();
            setUp();
        }

        if (opInput == 2) {
            TwoVars();
            model.setMathOp(Math.OPERATOR.MINUS);
            calcAnswer = model.calculate();
            printAnswer();
            setUp();
        }

        if (opInput == 3) {
            TwoVars();
            model.setMathOp(Math.OPERATOR.MULTIPLY);
            calcAnswer = model.calculate();
            printAnswer();
            setUp();
        }

        if (opInput == 4) {
            TwoVars();
            model.setMathOp(Math.OPERATOR.DIVIDE);
            calcAnswer = model.calculate();
            printAnswer();
            setUp();
        }

        if (opInput == 5) {
            TwoVars();
            model.setMathOp(Math.OPERATOR.MOD);
            calcAnswer = model.calculate();
            printAnswer();
            setUp();
        }

        if (opInput == 6) {
            OneVar();
            model.setMathOp(Math.OPERATOR.SIN);
            calcAnswer = model.calculate();
            printAnswer();
            setUp();
        }

        if (opInput == 7) {
            OneVar();
            model.setMathOp(Math.OPERATOR.COS);
            calcAnswer = model.calculate();
            printAnswer();
            setUp();
        }

        if (opInput == 8) {
            OneVar();
            model.setMathOp(Math.OPERATOR.TAN);
            calcAnswer = model.calculate();
            printAnswer();
            setUp();
        }

        if (opInput == 9) {
            TwoVars();
            model.setMathOp(Math.OPERATOR.POWER);
            calcAnswer = model.calculate();
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
        double var1 = Input.nextDouble();
        model.setArg1(var1);

        System.out.println("Enter arg2:");
        double var2 = Input.nextDouble();
        model.setArg2(var2);
    }

    public void OneVar() {
        System.out.println("Enter arg1:");
        double var1 = Input.nextDouble();
        model.setArg1(var1);
    }

    public void printAnswer() {
        System.out.println("Answer: "+calcAnswer+"\n");
    }

    public static void main(String[] args) {
        CalculatorConsoleUI calculatorConsole = new CalculatorConsoleUI();
        calculatorConsole.setUp();
    }

}
