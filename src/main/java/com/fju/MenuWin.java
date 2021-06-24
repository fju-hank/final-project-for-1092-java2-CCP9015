package com.fju;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuWin {
    static final int WIDTH = 1300;
    static final int HEIGHT = 1000;

    public static void main(String[] args) {

        Button button = new Button();

        JFrame jFrame = new JFrame("自動點餐機");
        jFrame.setSize(WIDTH,HEIGHT);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);

        Font font = new Font("新細明體",Font.BOLD,20);

        JButton bt1 =  new JButton("鰻魚丼飯 NT$220");
        bt1.setHorizontalAlignment(JButton.CENTER);
        bt1.setBounds(30,30,200,200);
        bt1.setFont(font);
        jFrame.add(bt1);

        JButton bt2 =  new JButton("鮭魚刺身 NT$220");
        bt2.setHorizontalAlignment(JButton.CENTER);
        bt2.setBounds(240,30,200,200);
        bt2.setFont(font);
        jFrame.add(bt2);

        JButton bt3 =  new JButton("綜合刺身 NT$220");
        bt3.setHorizontalAlignment(JButton.CENTER);
        bt3.setBounds(450,30,200,200);
        bt3.setFont(font);
        jFrame.add(bt3);

        JButton bt4 =  new JButton("照燒雞腿 NT$180");
        bt4.setHorizontalAlignment(JButton.CENTER);
        bt4.setBounds(660,30,200,200);
        bt4.setFont(font);
        jFrame.add(bt4);

        JButton bt5 =  new JButton("原味豬排 NT$220");
        bt5.setHorizontalAlignment(JButton.CENTER);
        bt5.setBounds(30,240,200,200);
        bt5.setFont(font);
        jFrame.add(bt5);

        JButton bt6 =  new JButton("起士豬排 NT$180");
        bt6.setHorizontalAlignment(JButton.CENTER);
        bt6.setBounds(240,240,200,200);
        bt6.setFont(font);
        jFrame.add(bt6);

        JButton bt7 =  new JButton("鹽烤鯖魚 NT$180");
        bt7.setHorizontalAlignment(JButton.CENTER);
        bt7.setBounds(450,240,200,200);
        bt7.setFont(font);
        jFrame.add(bt7);

        JButton bt8 =  new JButton("岩鹽牛排 NT$180");
        bt8.setHorizontalAlignment(JButton.CENTER);
        bt8.setBounds(660,240,200,200);
        bt8.setFont(font);
        jFrame.add(bt8);

        JButton bt9 =  new JButton("天婦羅　 NT$40");
        bt9.setHorizontalAlignment(JButton.CENTER);
        bt9.setBounds(30,450,200,200);
        bt9.setFont(font);
        jFrame.add(bt9);

        JButton bt10 =  new JButton("茶碗蒸　 NT$20");
        bt10.setHorizontalAlignment(JButton.CENTER);
        bt10.setBounds(240,450,200,200);
        bt10.setFont(font);
        jFrame.add(bt10);

        JButton bt11 =  new JButton("溏心蛋　  NT$20");
        bt11.setHorizontalAlignment(JButton.CENTER);
        bt11.setBounds(450,450,200,200);
        bt11.setFont(font);
        jFrame.add(bt11);

        JButton bt12 =  new JButton("和風野蔬 NT$40");
        bt12.setHorizontalAlignment(JButton.CENTER);
        bt12.setBounds(660,450,200,200);
        bt12.setFont(font);
        jFrame.add(bt12);

        JButton bt13 =  new JButton("黃金脆薯 NT$30");
        bt13.setHorizontalAlignment(JButton.CENTER);
        bt13.setBounds(30,660,200,200);
        bt13.setFont(font);
        jFrame.add(bt13);

        JButton bt14 =  new JButton("檸檬冰沙 NT$35");
        bt14.setHorizontalAlignment(JButton.CENTER);
        bt14.setBounds(240,660,200,200);
        bt14.setFont(font);
        jFrame.add(bt14);

        JButton bt15 =  new JButton("可口可樂 NT$20");
        bt15.setHorizontalAlignment(JButton.CENTER);
        bt15.setBounds(450,660,200,200);
        bt15.setFont(font);
        jFrame.add(bt15);

        JButton bt16 =  new JButton("抹茶布丁 NT$30");
        bt16.setHorizontalAlignment(JButton.CENTER);
        bt16.setBounds(660,660,200,200);
        bt16.setFont(font);
        jFrame.add(bt16);






    }


    }

