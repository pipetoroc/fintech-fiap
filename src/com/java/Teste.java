package com.java;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {

        //birthDate from User
        String birthDateText = "11-10-1991";
        //Object DateTimeFormatter
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //Parse String and create LocalDate
        LocalDate birthDate = LocalDate.parse(birthDateText, formatter);

        //Objects BankAccount
        BankAccount account1 = new BankAccount(2000);
        BankAccount account2 = new BankAccount(5000);
        BankAccount account3 = new BankAccount(6000);

        //Objects User are created
        User myFirstUser = new User("Felipe Toro", "pipe45toro", account1, "pipetoroc", birthDate );
        User secondUser = new User("Alana", "12354465",  account2, "alana123");
        User thirdUser = new User("Igor", "secreto123", account3, "imsIgor");



        System.out.println(myFirstUser + "\n");
        System.out.println(secondUser + "\n");
        System.out.println(thirdUser);

    }
}