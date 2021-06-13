package com.fju.food;

public class Beef extends Menu{
    public Beef(){
            id = "h";
    }

    @Override
    public String getName() {
        return "岩鹽牛排";
    }

    @Override
    public int price() {
        return 180;
    }
}
