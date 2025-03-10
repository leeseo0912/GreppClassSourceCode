package com.grepp.coffeemanager.domain.coffee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class SeasonCoffee extends Coffee {


    private Month[] seson;

    public SeasonCoffee(String name, int price, int purchasePrice, int stock, int safetyStock, Month[] seson) {
        super(name, price, purchasePrice, stock, safetyStock);
        this.seson = seson;
    }

    public boolean notSeason(){
        Month now = LocalDate.now().getMonth();
        for(Month month : seson){
            if(month.equals(now)) return false;
        }
        return true;
    }
}
