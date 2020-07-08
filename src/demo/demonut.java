/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author Admin
 */
public class demonut extends JFrame{

    public demonut() {
        setTitle("Demo JPanel");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        
        JPanel jp=new JPanel();
        jp.setBorder(BorderFactory.createEmptyBorder());
        jp.setLayout(new GridLayout(3,3,2,2));
//Xếp các nút theo thứ tự các ô bằng nhau và bằng khoảng cách giữa chungs
        add(jp);
        JButton [] nut=new JButton[9];
        for (int i = 0; i <9; i++) {
            nut[i]=new JButton("Button"+(i+1));
            jp.add(nut[i]);
            
        }
    }
    
}
