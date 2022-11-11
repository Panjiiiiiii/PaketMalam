 
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
public class luasSegitiga {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Masukkan nilai alas: ");
        Double alas = scan.nextDouble();
        System.out.println("Masukkan nilai tinggi: ");
        Double tinggi = scan.nextDouble();
        Double luasSegitiga = ((alas*tinggi)/2);
        //System.out.println("Luas Segitiga: "+luasSegitiga);
        System.out.println("Alas :"+alas+"\nTinggi :"+tinggi+"\nLuas Segitiga :"+luasSegitiga);
    }
}
