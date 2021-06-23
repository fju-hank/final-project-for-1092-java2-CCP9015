package com.fju.food;

public class HanjukuEgg extends Menu{
    public HanjukuEgg(){
            id = "l";
    }

    @Override
    public String getName() {
        return "溏心蛋　";
    }

    @Override
    public int price() {
        return 20;
    }
}
