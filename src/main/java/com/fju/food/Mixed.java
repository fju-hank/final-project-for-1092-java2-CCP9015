package com.fju.food;

public class Mixed extends Menu{
    public Mixed(){
            id = "c";
    }

    @Override
    public String getName() {
        return "綜合刺身";
    }

    @Override
    public int price() {
        return 220;
    }
}
