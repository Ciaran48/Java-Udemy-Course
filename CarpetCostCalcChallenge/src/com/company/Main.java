package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(10,10);
        Calculator calculator = new Calculator(carpet, floor);
        System.out.println(calculator.getTotalCost());
    }
}
