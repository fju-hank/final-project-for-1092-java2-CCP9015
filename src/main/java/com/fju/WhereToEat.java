package com.fju;

import java.util.Random;
import java.util.Scanner;

public class WhereToEat {
    public void greetings(){
        System.out.println("~歡迎光臨三口食堂~");
        System.out.println("內用請按 1 ，外帶請按 2");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.next();
        if (ans.equals("1")){
            System.out.println("請輸入桌號：");
            ans = scanner.next();
            System.out.println("您的桌號是 " + ans );
            System.out.println("稍後為您送上餐點");
        }
        else if (ans.equals("2")){
            Random random = new Random();
            int num = random.nextInt(50) + 1;
            System.out.println("您的取餐編號是 " + num );
            System.out.println("外帶區顯示號碼即可取餐");
        }
    }
}
