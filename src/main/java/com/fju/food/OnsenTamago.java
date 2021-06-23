package com.fju.food;

public class OnsenTamago extends Menu{
    public OnsenTamago(){
            id = "k";
    }

    @Override
    public String getName() {
        return "溫泉蛋　";
    }

    @Override
    public int price() {
        return 20;
    }
}
