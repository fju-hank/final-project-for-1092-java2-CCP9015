package com.fju;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Receipt {
    public Receipt number() {

        {

            int i[] = new int[8];
            Random random = new Random();
            System.out.println("需要統編嗎");
            Scanner scan = new Scanner(System.in);
            String ans = scan.next();
            if (ans.equals("Y")) {
                System.out.println("請輸入統一編號 :");
                String tax = scan.next();
                System.out.println("109年5月-6月");
                System.out.print("CP-");
                for (int j = 0; j < 9; j++) {
                    i[j] = random.nextInt(8) + 1;
                    System.out.print(i[j]);
                }
                String now =
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
                System.out.println(now);
                System.out.println("統一編號:" + tax);
            }
            if (ans.equals("N")) {
                System.out.println("109年5月-6月");
                System.out.print("CP-");
                for (int j = 0; j < 10; j++) {
                    i[j] = random.nextInt(8) + 1;
                    System.out.print(i[j]);
                }
                String now =
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
                System.out.println(now);

            }
        }
        return null;
    }

}

