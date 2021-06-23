package com.fju.food;

public class SteamedEggs extends Menu{
    public SteamedEggs(){
            id = "j";
    }

    @Override
    public String getName() {
        return "茶碗蒸　";
    }

    @Override
    public int price() {
        return 20;
    }
}
