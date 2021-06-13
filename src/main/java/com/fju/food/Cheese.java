package com.fju.food;

public class Cheese extends Menu{
    public Cheese(){
            id = "f";
    }

    @Override
    public String getName() {
        return "起士豬排";
    }

    @Override
    public int price() {
        return 180;
    }
}
