package com.fju.food;

public class LemonSmoothie extends Menu{
    public LemonSmoothie(){
            id = "p";
    }

    @Override
    public String getName() {
        return "檸檬";
    }

    @Override
    public int price() {
        return 35;
    }
}
