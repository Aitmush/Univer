package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Reader cal = new Reader("Калькулятор");
        cal.setVisible(true);
        cal.setSize(250,300);
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.setResizable(false);
        cal.setLocationRelativeTo(null);
    }
}
