/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.tap.lap.pkg2.bai.pkg3;

import java.util.Scanner;

/**
 *
 * @author Tran Huu Vinh
 */
public class BaiTapLap2Bai3 {

    public static void main(String... args) {

        long soKyDien, tien = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Chương trình tính tiền điện");
            
            
            
            do {
                
                System.out.print("Nhập vào số ký điện của tháng = ");
                
                soKyDien = scanner.nextLong();
                
                if (soKyDien <= 0)
                    
                    System.out.println("Số ký điện không được nhỏ hơn hoặc bằng 0");
                
            } while (soKyDien <= 0);
            
            
            
            if (soKyDien < 50) {
                
                tien = soKyDien * 1000;
                
            } else {
                
                tien = 50 * 1000 + (soKyDien - 50) * 1200;
                
            }
            
            System.out.println("Tiền điện phải trả là: " + tien);
        }
    }
    
}
