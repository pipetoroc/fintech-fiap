package com.java;
import java.time.LocalDate;

public class User {
    //Attributes
    private String userName;
    private String password;
    private BankAccount bankAccount;
    private String nickname;
    private LocalDate birthDate;

    //Constructor Methods
    public  User(String userName, String password, BankAccount bankAccount){
        this.userName = userName;
        this.password = password;
        this.bankAccount = bankAccount;
    }
    public  User(String userName, String password, BankAccount bankAccount, String nickname){
        this( userName, password, bankAccount);
        this.nickname = nickname ;
    }
    public  User(String userName, String password,  BankAccount bankAccount, String nickname, LocalDate birthDate){
        this(userName, password, bankAccount, nickname);
        this.bankAccount = bankAccount;

        this.birthDate = birthDate;
    }


    //Getters and setters

    //Show user information
    @Override
    public String toString(){
        return  "User name: " + userName + "\nNickname: " + nickname + "\nAccount Balance: " + bankAccount.getAccountBalance();
    }
}
