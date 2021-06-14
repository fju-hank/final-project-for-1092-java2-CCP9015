package com.fju;

import java.io.*;

public class ReadFile {
    public ReadFile print() {
        try {
            FileInputStream fis = new FileInputStream("menu.txt");
            InputStreamReader irs = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(irs);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}

