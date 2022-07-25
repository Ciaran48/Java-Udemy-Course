package com.company;

public class Main {

    public static void main(String[] args) {

        bankAccount one = new bankAccount(1,300,"John","John@hotmail.com",0767777710);
        bankAccount two = new bankAccount();//bad practice could be issue with inheritamce
        vipCustomer three = new vipCustomer();
        vipCustomer four = new vipCustomer("jim@yahoo.com", "mij");
        vipCustomer five = new vipCustomer(99, "jimbo@gmail.com", "jimbo");


        one.deposit(200);
        System.out.println(one.getBalance());
        one.withdraw(400);
        System.out.println(one.getBalance());
        one.withdraw(400);
        System.out.println(one.getBalance());
        one.withdraw(500);
        System.out.println(three.getName());
        System.out.println(four.getCreditLimit());
        System.out.println(five.getName());


    }
}
