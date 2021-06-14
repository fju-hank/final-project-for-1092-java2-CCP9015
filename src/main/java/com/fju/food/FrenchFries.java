package com.fju.food;

public class FrenchFries extends Menu{
    public FrenchFries(){
            id = "o";
    }

    @Override
    public String getName() {
        return "黃金脆薯";
    }

    @Override
    public int price() {
        return 30;
    }
}
