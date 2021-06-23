package com.fju;

import com.fju.food.*;
import com.fju.food.Menu;

import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Menu[] food = {
                new Beef(), new Calpis(), new Cheese(), new Coke(), new Drumstick(),
                new Fish(), new FrenchFries(), new GrilledEel(), new Gyoza(), new HanjukuEgg(),
                new LemonSmoothie(), new MangoPudding(), new MatchaPudding(), new Mixed(), new OnsenTamago(),
                new Pork(), new Salmon(), new SteamedEggs(), new Tempura(), new Vegetables()

        };
        String foodName;
        Scanner scan = new Scanner(System.in);
        String input = null;
        String name = null;
        int end = -1;
        int sum = 0;
        int price;

       HashMap<String, Integer> hashMap = new HashMap<>();
        ReadFile readFile = new ReadFile();
        readFile.print();
        System.out.println();

        do{
            System.out.println("你今天想吃什麼? 請輸入代號，如果想結束點餐請輸入N");
            input = scan.next();
            for (Menu order : food) {
                if (order.name(input)) {

                    System.out.println("請輸入數量");
                    int num = scan.nextInt();
                    price = order.price()*num;
                    System.out.println(order.getName() + "*" + num + "\t" + "NT$" + price);
                    sum = sum + price;
                    name = order.getName()+ "*" + num;
                    hashMap.put(name ,price);

                }
                else if(input.equals("N")){
                    end = 0;
                }

            }

    }while (end != 0);
        System.out.println("總價:" + sum + "元");
        Receipt receipt = new Receipt();
        receipt.number();
        Set<String> order = hashMap.keySet();
        System.out.println("餐點項目" + "\t\t" + "價錢");
        for (String read : order) {
            System.out.println(read + "\t" + "NT$" + hashMap.get(read));
            
        }
        System.out.println("\t\t\t" + "總價:" + sum+ "元");
        System.out.println("----------------------");
    }
    }

