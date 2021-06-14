package com.fju.food;

public class MatchaPudding extends Menu{
    public MatchaPudding(){
            id = "t";
    }

    @Override
    public String getName() {
        return "抹茶布丁";
    }

    @Override
    public int price() {
        return 30;
    }
}
