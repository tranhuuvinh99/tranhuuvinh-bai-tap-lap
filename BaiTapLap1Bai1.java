/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.tap.lap.pkg1.bai.pkg1;

import java.util.Scanner;

/**
 *
 * @author Tran Huu Vinh
 */
public class BaiTapLap1Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Thông tin sinh viên!");
            
            System.out.print("Họ và tên: ");
            
            String hoTen = scanner.nextLine();
            
            System.out.print("ĐIểm TB: ");
            
            double diemTB = scanner.nextDouble();
            
            if (diemTB < 0 || diemTB > 10) {
                
                System.out.println("Vui lòng nhập lại điểm của bạn!");
                
            } else {
                
                System.out.print(hoTen + " " + diemTB + " điểm\n");
                
                System.out.println(hoTen + " " + diemTB + " điểm");
                
                System.out.printf("%s %f điểm", hoTen, diemTB);
                
            }
        }

    }



}
    
    

