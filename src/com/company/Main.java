package com.company;

import com.company.cost.Cost;
import com.company.cost.Payment;
import com.company.intraduction.Hotel;
import com.company.intraduction.Intraduction;
import com.company.service.Service;
import com.company.service.ServiceHotel;

public class Main {

    public static void main(String[] args) {
        Intraduction intraduction = new Hotel();
        Cost cost = new Payment();
        Service service = new ServiceHotel();


        intraduction.Name();
        intraduction.Address();
        cost.cost1();
        cost.cost2();
        service.Quality();
        service.Rooms();
        service.ExtraService();
    }


}
