
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
public class luasLingkaran {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Masukkan nilai jariJari");
        Double jariJari= scan.nextDouble();
        Double luasLingkaran= ((3.14*jariJari*jariJari));
        //System.out.println("Luas Lingkaran: "+luasLingkaran);
        System.out.println("jari-jari :"+jariJari+"\nLuas Lingkaran :"+luasLingkaran);
    }
   
}
