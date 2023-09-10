package com.java;
import java.util.Date;

public class Transaction {
    private int id;
    private String type;
    private String description;
    private double value;
    private Date date;

    public Transaction(int id, String type, String description, double value){
        this.id = id;
        this.type = type;
        this.description = description;
        this.value = value;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
