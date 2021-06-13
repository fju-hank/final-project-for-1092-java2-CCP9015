package com.fju;

public abstract class Menu {
    String id;
    public boolean name(String name){
        return (id.equalsIgnoreCase(name));
    }
    public abstract String getName();
    public abstract int price();

}
