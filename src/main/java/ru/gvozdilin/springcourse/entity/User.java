package ru.gvozdilin.springcourse.entity;

public class User {

    public User(){
    }

    private int id;
    private String name;
    private int balance;


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

}
