package com.java;

public class BankAccount {
   private int numberAccount;
   private String bankName;
   private double accountBalance;
   private String accountDescription;

   //Constructor
   public BankAccount(double accountBalance){
       this.accountBalance = accountBalance;
   }

   //Getters and Setters
    public int getNumberAccount() {
        return numberAccount;
    }
    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getAccountBalance() {
       return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountDescription() {
        return accountDescription;
    }
    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }
}
