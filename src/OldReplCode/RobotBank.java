package OldReplCode;//Created by Sanvi
//Robot Bank

import java.util.*;


public class RobotBank {
  public static void main(String[] args) {
    //creating bank object
    Bank bank = new Bank("Robot Bank", 888888888);

    //setting up account for Sanvi
    Account sanviAc;
    sanviAc = bank.CreateAccount("Sanvi Pal", "spal", "password");
    sanviAc.Deposit(100);

    //allowing user to set account
    System.out.println("Welcome to Robot Bank");

    System.out.print("Hi! Please type in your name: ");
    Scanner kboard = new Scanner (System.in);
    String name = kboard.next();

    System.out.print("Type in your username: ");
    kboard = new Scanner (System.in);
    String username = kboard.next();

    System.out.print("Type in your password: ");
    kboard = new Scanner (System.in);
    String password = kboard.next();

    System.out.print("How much do you want to deposit? ");
    kboard = new Scanner (System.in);
    double amountadd = kboard.nextDouble();

    //demoing the CreatAccount, Deposit, Print Bank Details Methods
    Account newAc;
    newAc = bank.CreateAccount(name, username, password);
    newAc.Deposit(amountadd);
    bank.PrintBankDetails();

    //demoing Withdraw 
    sanviAc.Withdraw(20);

    bank.PrintBankDetails();
  }
}
