/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class Perulangan {
    public static void main(String[] args) {
        String tipe=null;
        for (int i = 1; i <= 10; i++) {
            if (i%2==0){
                tipe = "genap";
            }else{
                tipe = "ganjil";
            }
            System.out.println( i + " bilangan " + tipe); 
        }
    }
    
}
