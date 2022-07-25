package com.company;

public class bankAccount {

    private int accountNumber;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;


    public bankAccount(int accountNumber, int balance, String name, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public bankAccount() {
        System.out.println("Blank Account");

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void deposit(int amount){
        balance += amount;
        System.out.println("Balance = " + balance);
    }
    public void withdraw(int amount){
        if (balance - amount < 0){
            System.out.println("Not enough funds");
        }
        else
            balance = balance - amount;
        System.out.println("Balance = " + balance);
    }
}
