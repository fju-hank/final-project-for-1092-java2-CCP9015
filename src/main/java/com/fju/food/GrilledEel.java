package com.fju.food;

public class GrilledEel extends Menu{
    public GrilledEel(){
            id = "a";
    }

    @Override
    public String getName() {
        return "鰻魚丼飯";
    }

    @Override
    public int price() {
        return 220;
    }
}
