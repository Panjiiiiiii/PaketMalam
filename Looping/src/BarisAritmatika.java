/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class BarisAritmatika {
    public static void main(String[] args) {
        //Un = a+(n-1)b
        //Sn = n/2(2a+(n-1)b)
        
        int awal = 10;
        int beda = 4;
        int sukuke = 10;
        int u = awal;
        int s =0;
        
        
        for (int i = 0; i < sukuke; i++) {
            u = u + beda;
            if (i >= 5 && i <=10) {
            System.out.print(u+",");
            s=s+u;
//            u = u + beda;
            }
              System.out.println();
        }
        
      
        System.out.println("Total deret aritmatika "+s);
    
        
    }   
}
