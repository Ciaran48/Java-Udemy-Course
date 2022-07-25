package com.company;

public class vipCustomer {
    private int creditLimit;
    private String email;
    private String name;

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public vipCustomer(int creditLimit, String email, String name) {
        this.creditLimit = creditLimit;
        this.email = email;
        this.name = name;
    }

    public vipCustomer() {
        this(99, "jim@hotmail.com", "jim");
    }

    public vipCustomer(String email, String name) {
        this(99, email, name);
    }



}
