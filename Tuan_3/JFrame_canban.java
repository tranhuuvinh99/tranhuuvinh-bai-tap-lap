/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhgd.tuan3;

import java.awt.Color;
import javax.swing.JFrame;


/**
 *
 * @author Tran Huu Vinh
 */

    public class JFrame_canban extends JFrame {

    public JFrame_canban() {
        setTitle("Demo JFrame Căn Bản");
        setBackground(Color.DARK_GRAY);


        setForeground(Color.RED);


        setSize(400, 300);


        setResizable(false);


        setLocationRelativeTo(null);


        setDefaultCloseOperation(EXIT_ON_CLOSE);


        setVisible(true);


    }
      public static void main(String[] args) {


        JFrame_canban JFrame_canban; /*jFrame_canban*/
        JFrame_canban = new JFrame_canban();
    }
}
