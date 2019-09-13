/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.tap.lap.pkg1.bai.pkg2;

import java.util.Scanner;

/**
 *
 * @author Tran Huu Vinh
 */
public class BaiTapLap1Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Tính chu vi, diện tích hình chữ nhật!");
            
            System.out.print("Nhập vào chiều dài: ");
            
            double dai = scanner.nextDouble();
            
            System.out.print("Nhập vào chiều rộng: ");
            
            double rong = scanner.nextDouble();
            
            double chiVi = (dai + rong) * 2;
            
            double dienTich = dai * rong;
            
            double min = Math.min(dai, rong);
            
            
            
            System.out.println("Chu vi = " + chiVi);
            
            System.out.printf("Diện tích = %.2f\n", dienTich);
            
            System.out.println("Cạnh nhỏ nhất = " + min);
        }
    }
    
}
