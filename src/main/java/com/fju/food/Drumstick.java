package com.fju.food;

public class Drumstick extends Menu{
    public Drumstick(){
            id = "d";
    }

    @Override
    public String getName() {
        return "照燒雞腿";
    }

    @Override
    public int price() {
        return 180;
    }
}
