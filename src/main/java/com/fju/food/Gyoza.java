package com.fju.food;

public class Gyoza extends Menu{
    public Gyoza(){
            id = "m";
    }

    @Override
    public String getName() {
        return "日式餃子";
    }

    @Override
    public int price() {
        return 30;
    }
}
