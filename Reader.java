package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bSum, bDif,bMult, bDiv,  bDel, bEq;
    JTextField t1;
    int i = 0, k = 10, Sum = 0, Dif = 0, Mult = 0, Div = 0;
    String j, h;
    int a, b;

    eHandler handler = new eHandler();
    public Reader(String s){
        super(s);
        setLayout(new FlowLayout());
        t1 = new JTextField(12);
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("   0   ");
        bSum = new JButton("+");
        bDif = new JButton("-");
        bMult = new JButton("*");
        bDiv = new JButton("/");
        bDel = new JButton("Del");
        bEq = new JButton("  =  ");
        t1.setEditable(false);
        add(t1);
        add(bDel);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(bEq);
        add(bSum);
        add(bDif);
        add(bDiv);
        add(bMult);
        bDel.addActionListener(handler);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        b0.addActionListener(handler);
        bEq.addActionListener(handler);
        bSum.addActionListener(handler);
        bDif.addActionListener(handler);
        bDiv.addActionListener(handler);
        bMult.addActionListener(handler);
    }
    public class eHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == bDel){
                t1.setText(null);
                i=0;
            }

            if(e.getSource() == b1){
                t1.setText(t1.getText() + 1);
            }
            if(e.getSource() == b2){
                t1.setText(t1.getText() + 2);
            }
            if(e.getSource() == b3){
                t1.setText(t1.getText() + 3);
            }
            if(e.getSource() == b4){
                t1.setText(t1.getText() + 4);
            }
            if(e.getSource() == b5){
                t1.setText(t1.getText() + 5);
            }
            if(e.getSource() == b6){
                t1.setText(t1.getText() + 6);
            }
            if(e.getSource() == b7){
                t1.setText(t1.getText() + 7);
            }
            if(e.getSource() == b8){
                t1.setText(t1.getText() + 8);
            }
            if(e.getSource() == b9){
                t1.setText(t1.getText() + 9);
            }
            if(e.getSource() == b0){
                t1.setText(t1.getText() + 0);
            }

            if(e.getSource() == bEq){
                h = t1.getText();
                b = Integer.parseInt(h);
                a = Integer.parseInt(j);
                if(Sum == 1){
                    t1.setText(a+b+"");
                    Sum = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }

                if(Dif == 1){
                    t1.setText(a-b+"");
                    Dif = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }

                if(Mult == 1){
                    t1.setText(a*b+"");
                    Mult = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }

                if(Div == 1){
                    t1.setText(a/b+"");
                    Div = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";

                }
            }
            if(e.getSource() == bSum){
                j = t1.getText();
                t1.setText(null);
                Sum++;
            }
            if(e.getSource() == bDif){
                j = t1.getText();
                t1.setText(null);
                Dif++;
            }
            if(e.getSource() == bMult){
                j = t1.getText();
                t1.setText(null);
                Mult++;
            }
            if(e.getSource() == bDiv){
                j = t1.getText();
                t1.setText(null);
                Div++;
            }
        }
    }
}
