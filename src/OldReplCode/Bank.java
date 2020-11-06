package OldReplCode;//Created by Sanvi
//Robot Bank

import java.util.*;

class Bank {
 //global variable
 private static int mLastAccountNumber = 0;

 //attributes
 private String mBankName;
 private int mRoutingNumber;
 private ArrayList<Account> mAccounts;
 
 //constructors 
 public Bank(){

  mAccounts = new ArrayList<Account>();
 }

 public Bank(String bankName, int routingNumber){
   mBankName = bankName;
   mRoutingNumber = routingNumber;
   mAccounts = new ArrayList<Account>(); 
 }
 
 //methods
 //creates account
 public Account CreateAccount (String name, String username, String password){
   mLastAccountNumber++;
   Account account = new Account(name, username, password, mLastAccountNumber);
   mAccounts.add(account);
   return account;
 }

  //deletes account
  public void DeleteAccount(int nAccountNumber){
    for (Account ac : mAccounts){
      if (nAccountNumber == ac.getAccountNumber()){
        mAccounts.remove(ac);
        break;
      }
    }
  }

  //prints bank details
  public void PrintBankDetails(){
    System.out.println("Bank Name: " + mBankName + " Routing Number: " + mRoutingNumber);
    for (Account ac : mAccounts){
      ac.PrintAccountDetails();
    }
    System.out.println("-----------------------------------------");
  }
 }