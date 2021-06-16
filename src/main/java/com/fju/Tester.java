package com.fju;

import com.fju.food.*;

import java.io.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Menu[] food = {
                new Beef(), new Calpis(), new Cheese(), new Coke(), new Drumstick(),
                new Fish(), new FrenchFries(), new GrilledEel(), new Gyoza(), new HanjukuEgg(),
                new LemonSmoothie(), new MangoPudding(), new MatchaPudding(), new Mixed(), new OnsenTamago(),
                new Pork(), new Salmon(), new SteamedEggs(), new Tempura(), new Vegetables()

        };
        Scanner scan = new Scanner(System.in);
        String input = null;
        int end = -1;
        ReadFile readFile = new ReadFile();
        readFile.print();
        System.out.println();
        System.out.println("你今天想吃甚麼");

            input = scan.next();
            for (Menu order : food) {
                if (order.name(input)) {
                    System.out.println(order.getName() + "\t" + order.price());
                    break;

                }


            }


    }
    }

