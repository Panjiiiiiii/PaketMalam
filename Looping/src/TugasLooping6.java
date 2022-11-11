/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class TugasLooping6 {
    public static void main(String[] args) {
        int totalbilangan = 0;
        for (int i = 0; i <= 50; i+=4) {
            System.out.println(i);
            totalbilangan +=i; 
            
        }
        System.out.println("Jumlah bilangan yang ditampilkan: "+totalbilangan);
    }
}
