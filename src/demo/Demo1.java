/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class Demo1 extends JFrame {

    Button btnyellow, btnred;
    Label lblResuilt;

    public Demo1() {

        setLocationRelativeTo(null);//Căn ra giữa
        setDefaultCloseOperation(EXIT_ON_CLOSE);//xét chế độ đóng
        setResizable(false);//Không cho thay đối kích thước
        setTitle("Demo AWt");//Tiêu đề
        setSize(400, 400);//Kích thước
        setLayout(new FlowLayout());//set ché đô chình bày

        btnred = new Button("Red");
        btnyellow = new Button("Yellow");
        lblResuilt = new Label("Resuilt");

        add(btnred);
        add(btnyellow);
        add(lblResuilt);

        //Gắn sự kiện
        btnred.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getContentPane().setBackground(Color.RED);
                lblResuilt.setText("RED");
            }
        });
        btnyellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getContentPane().setBackground(Color.YELLOW);
                lblResuilt.setText("YELLOW");
            }
        });
    }

}
