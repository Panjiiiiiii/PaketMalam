
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
public class luasPersegi {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Masukkan nilai sisi");
        Double sisi= scan.nextDouble();
        Double luasPersegi= ((sisi*sisi));
        //System.out.println("Luas Persegi: "+luasPersegi);
        System.out.println("Sisi :"+sisi+"\nLuas Persegi :"+luasPersegi);
    }
}
