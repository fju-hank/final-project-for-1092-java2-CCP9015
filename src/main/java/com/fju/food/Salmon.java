package com.fju.food;

public class Salmon extends Menu{
    public Salmon(){
        id = "b";
    }

    @Override
    public String getName() {
         return "鮭魚刺身";
    }

    @Override
    public int price() {
        return 220;
    }
}
