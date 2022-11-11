
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class luasPersegiPanjang {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Masukkan nilai panjang");
        Double panjang= scan.nextDouble();
        System.out.println("Masukkan nilai lebar");
        Double lebar= scan.nextDouble();
        Double luasPersegiPanjang= ((panjang*lebar));
        //System.out.println("Luas Persegi Panjang: "+luasPersegiPanjang);
        System.out.println("panjang :"+panjang+"Lebar ="+lebar+"Luas Persegi Panjang :"+luasPersegiPanjang);
    }
    
}
