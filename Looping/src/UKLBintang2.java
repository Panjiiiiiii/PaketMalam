/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class UKLBintang2 {
    public static void main(String[] args) {
         /*
        *
        **
        ***
        ****
        
        *****
        ****
        ***
        
        **
        ***
        ****
        *****
        */
         
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+2; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
