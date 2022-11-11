/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class Matrix3 {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int u=a;
        int s=a;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
            
        }
        s=s-u;
        System.out.println("Jumlah deret adalah "+s);
    }
 
}
