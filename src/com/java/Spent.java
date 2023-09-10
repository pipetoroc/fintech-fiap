package com.java;

public class Spent extends Transaction{

    //Constructor Method from Super class Transaction
    public Spent(int id, String type, String description, double value) {
        super(id, type, description, value);
    }

    public void registerSpent(){

    }
}
