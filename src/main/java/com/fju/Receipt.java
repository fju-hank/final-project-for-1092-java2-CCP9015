package com.fju;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Receipt {
    public static void main(String[] args) {

        int i[] = new int[8];
        Random random = new Random();
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
