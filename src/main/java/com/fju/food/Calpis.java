package com.fju.food;

public class Calpis extends Menu{
    public Calpis(){
            id = "r";
    }

    @Override
    public String getName() {
        return "可爾必思";
    }

    @Override
    public int price() {
        return 20;
    }
}
