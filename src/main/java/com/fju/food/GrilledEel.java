package com.fju.food;

import javax.swing.*;

public class GrilledEel extends Menu{
    public GrilledEel(){
            id = "a";
    }

    @Override
    public String getName() {
        return "鰻魚丼飯";
    }

    @Override
    public int price() {
        return 220;
    }


}
