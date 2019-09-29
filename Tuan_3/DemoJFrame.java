package com.dhgd.tuan3;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class DemoJFrame extends javax.swing.JFrame {
   public DemoJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")


    private void initComponents() {





        jPanel1 = new javax.swing.JPanel(){


            ImageIcon icon = new ImageIcon("C:/Users/Suong/Desktop/hoctap/nam3/Java-Application/Bai-Tap-Tuan/src/com/dhpm11/Tuan_3/Home/Lab_1/src/main/java/bai2/Untitled.png");


            @Override
            public void paintComponent(Graphics g){


                Dimension d = getSize();


                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);         setOpaque(false);         super.paintComponent(g);     }


        };
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                
        );


        layout.setVerticalGroup(


            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)


            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)


        );





        jPanel1.setBounds(400, 500, 400, 500);


        jPanel1.setBackground(Color.RED);
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));





        pack();


    }// </editor-fold>//GEN-END:initComponents

    /**


     * @param args the command line arguments


     */


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {


                if ("Nimbus".equals(info.getName())) {


                    javax.swing.UIManager.setLookAndFeel(info.getClassName());


                    break;


                }


            }


        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {


            java.util.logging.Logger.getLogger(DemoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);


        }
        java.awt.EventQueue.invokeLater(() -> {
            new DemoJFrame().setVisible(true);
        });
    }
    private javax.swing.JPanel jPanel1;


   
}