/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class Bintang2 {
    public static void main(String[] args) {
        for (int a = 1; a <= 4; a++) {
            for (int b = 3; b >= a; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print("*");
                
            }
            for (int d = 1; d <= a - 1; d++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
