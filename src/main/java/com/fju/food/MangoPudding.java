package com.fju.food;

public class MangoPudding extends Menu{
    public MangoPudding(){
            id = "s";
    }

    @Override
    public String getName() {
        return "芒果布丁";
    }

    @Override
    public int price() {
        return 30;
    }
}
