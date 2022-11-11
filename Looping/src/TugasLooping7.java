/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class TugasLooping7 {
    public static void main(String[] args) {
//        int rows = 5   , k = 0;
//        for (int i = 1; i <= rows; ++i, k = 0) {
//            for (int space = 1; space <= rows - i; ++space) 
//            {
//                System.out.print(" ");
//                
//            }
//            while (k!= 2*i-1){
//                System.out.print("*");
//            ++k;
//        }
//        System.out.println();
//        }

   
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < i+2; j++) {
                System.out.print("*");
            
            }
            System.out.println();
        }
}}
