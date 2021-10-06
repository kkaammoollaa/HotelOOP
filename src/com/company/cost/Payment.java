package com.company.cost;

public class Payment implements Cost{
    @Override
    public void cost1() {
        System.out.println("123$");
    }

    @Override
    public void cost2() {
        System.out.println("345$");
    }
}
