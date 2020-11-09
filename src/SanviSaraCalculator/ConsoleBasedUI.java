//Console Based Calculator Created by Sanvi
//View

package SanviSaraCalculator;

import java.util.Scanner;
//AP req- class for view
public class ConsoleBasedUI {
    public static void main(String[] args) {
        //printing out options
        System.out.println("Welcome the Calculator 2.0!");
        System.out.println("Choose a number to choose an operation");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("5 - Modulus");
        System.out.println("6 - Square");
        System.out.println("7 - Square Root");
        System.out.println("8 - Sin");
        System.out.println("9 - Cos");
        System.out.println("10 - Tan");
        System.out.println("11 - Sec");
        System.out.println("12 - Csc");
        System.out.println("13 - Cot");
        Scanner kboard = new Scanner(System.in);
        //AP req- Object (instance of ArgData to save data in the model)
        ArgData d = new ArgData();
        d.setOp(kboard.nextInt());
        //if-else control statement separate double and single arguments
        if (d.getOp() <= 5){
            System.out.println("What is your first argument?");
            Scanner kboard1 = new Scanner(System.in);
            d.setArg1(kboard1.nextDouble());
            System.out.println("What is your second argument?");
            Scanner kboard2 = new Scanner(System.in);
            d.setArg2(kboard2.nextDouble());
            System.out.println(new ArgOp().doOp(d, 2));
        }
        else{
            System.out.println("What is your argument?");
            Scanner kboard1 = new Scanner(System.in);
            d.setArg1(kboard1.nextDouble());
            System.out.println(new ArgOp().doOp(d, 1));

        }
    }

}
