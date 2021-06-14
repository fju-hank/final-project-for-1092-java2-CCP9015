package com.fju.food;

public class Vegetables extends Menu{
    public Vegetables(){
            id = "n";
    }

    @Override
    public String getName() {
        return "和風野蔬";
    }

    @Override
    public int price() {
        return 40;
    }
}
