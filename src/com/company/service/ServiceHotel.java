package com.company.service;

public class ServiceHotel implements Service{
    @Override
    public void Quality() {
        System.out.println("the best quality");
    }

    @Override
    public void Rooms() {
        System.out.println("150 rooms");
    }

    @Override
    public void ExtraService() {
        System.out.println("We have extra payment for some service");
    }
}
