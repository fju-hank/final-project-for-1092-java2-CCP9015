package com.fju;

import java.util.Scanner;

public class Payments {
        public void paid(){
            System.out.println("付款方式：");
            System.out.println("刷卡請按 1 ，付現請按 2");
            Scanner scan = new Scanner(System.in);
            String ans = scan.next();
            if(ans.equals("1")){
                System.out.println("請將信用卡放在感應器上");
                System.out.println("3");
                System.out.println("2");
                System.out.println("1");
                System.out.println("交易成功");
            }
            else if(ans.equals("2")){
                System.out.println("請在投幣處投入應支付金額");
                System.out.println("交易成功");
            }
        }
}
