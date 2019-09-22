/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.tap.lap.pkg1.bai.pkg3;

import java.util.Scanner;

/**
 *
 * @author Tran Huu Vinh
 */
public class BaiTapLap1Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Tính thể tích khối lập phương!");
            
            System.out.print("Nhập cạnh của khối lập phương: ");
            
            double canh = scanner.nextDouble();
            
            double theTich = Math.pow(canh, 3);
            
            
            
            System.out.printf("Thể tích của khối chữ nhật = %.2f", theTich);
        }
    }
    
}
