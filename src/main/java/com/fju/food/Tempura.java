package com.fju.food;

public class Tempura extends Menu{
    public Tempura(){
            id = "i";
    }

    @Override
    public String getName() {
        return "天婦羅";
    }

    @Override
    public int price() {
        return 40;
    }
}
