package OldReplCode;//Created by Sanvi
//Robot Bank

import java.lang.*;

class Account {

  //attributes
  private String mName;
  private int mNumber;
  private String mUsername;
  private String mPassword;
  private double mBalance;

  //constructors
  public Account(){

  }
 
  public Account(String name, String username, String password, int number){
    mName = name;
    mUsername = username;
    mPassword = password;
    mNumber = number;
    mBalance = 0.0;
  }

  //methods
  //withdraw money
  public double Withdraw (double amount){
    mBalance -= amount;
    return mBalance;
  }

  //add money
  public double Deposit (double amount){
    mBalance += amount;    
    return mBalance;
  }

  //print account details: name, number, balance
  public void PrintAccountDetails(){
    System.out.println("Name: "+ mName + ", Account Number: " + mNumber + ", Balance: "+ Double.toString(mBalance));
  }

  //accessor
  public int getAccountNumber(){
    return mNumber;
  }

}