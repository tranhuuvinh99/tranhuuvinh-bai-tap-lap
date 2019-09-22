/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.tap.lap.pkg2.bai.pkg1;

/**
 *
 * @author Tran Huu Vinh
 */
public class BaiTapLap2Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.println("Chương trình giải phương trình bậc 1");

        System.out.print("Nhập a = ");

        double a = scanner.nextDouble();

        System.out.print("Nhập b = ");

        double b = scanner.nextDouble();



        if (a == 0) {

            if (b == 0) {

                System.out.print("Vô số nghiệm");

            } else {

                System.out.print("Vô nghiệm");

            }

        } else if (b == 0) System.out.println("x = 0");

        else {

            double x = -b / a;

            System.out.printf("Có 1 nghiệm x = %.2f", x);

        }

        scanner.close();
    }
    
}
