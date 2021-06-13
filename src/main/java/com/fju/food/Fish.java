package com.fju.food;

public class Fish extends Menu{
    public Fish(){
            id = "g";
    }

    @Override
    public String getName() {
        return "鹽烤鯖魚";
    }

    @Override
    public int price() {
        return 180;
    }
}
