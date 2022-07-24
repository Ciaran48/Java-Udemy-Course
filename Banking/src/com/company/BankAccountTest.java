package com.company;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("Execute before tests, count is "  + count++);
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Ciaran", "Adams", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }


    @org.junit.Test
    public void deposit() {
        account.deposit(200.00, true);
    }

    @org.junit.Test
    public void withdrawAtBranch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdrawNotBranch() {
        double balance = account.withdraw(600.00, false);
        assertEquals(400.00, balance, 0);

    }

    @org.junit.Test
    public void getBalance() {
        assertEquals(1000.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getWithdrawBalance() {
        double balance = account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getDepositBalance() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }
    @org.junit.Test
    public void isChecking(){
        assertTrue("Is not a checking Account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after test cases count is "  + count);
    }

    @org.junit.After
    public void teardown(){
        System.out.println("Count is " + count++ );
    }
}