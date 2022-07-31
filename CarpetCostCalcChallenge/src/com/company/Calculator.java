package com.company;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Carpet carpet, Floor floor) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return (floor.getArea() * carpet.getCost());
    }
}
