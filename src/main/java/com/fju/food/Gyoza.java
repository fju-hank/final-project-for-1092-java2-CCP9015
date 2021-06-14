package com.fju.food;

public class Gyoza extends Menu{
    public Gyoza(){
            id = "h";
    }

    @Override
    public String getName() {
        return "m";
    }

    @Override
    public int price() {
        return 30;
    }
}
