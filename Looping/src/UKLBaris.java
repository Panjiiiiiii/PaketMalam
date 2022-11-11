/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class UKLBaris {
    public static void main(String[] args) {
        
       int awal = 5;
       int beda = 4;
       int sukuke = 10;
       int u =0;
       int s = 0;
       
        for (int i = 2; i < sukuke; i++) {
            awal+=beda;
            if (i >=4 && i<=8) {
                System.out.print(awal+",");
                s = s+awal;
                
            }
        }
        System.out.println();
        System.out.println("Total deret "+s);
       
    }
}
