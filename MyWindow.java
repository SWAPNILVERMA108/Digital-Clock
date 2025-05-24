package com.project1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;

    private Font font = new Font(" ", Font.BOLD, 35);

    MyWindow() {
        super.setTitle("My Digital Clock");
        super.setSize(400, 400);
        super.setLocation(300, 50);
        super.setVisible(true);
        createGUI();
        this.startClock();


    }

    public void createGUI() {
        heading = new JLabel("My Digital Clock");
        clockLabel = new JLabel("Clock");
        heading.setFont(font);
        clockLabel.setFont(font);


        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clockLabel);

    }

    public void startClock() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sfd = new SimpleDateFormat("d/M/y  hh : mm : ss ");
                String datetime = sfd.format(d);

               // String dateTime = new Date().toString();
                clockLabel.setText(datetime);
            }
        });
        timer.start();

    }


}








