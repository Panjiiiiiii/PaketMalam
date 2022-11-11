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
public class SatsetTambah {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Masukkan nilai x:");
        int x = scan.nextInt() ;
        System.out.println("Masukkan niai y:");
        int y = scan.nextInt();
        int totalxy= ((x+y));
        //System.out.println("totalxy "+totalxy);
        System.out.println("x :"+x+"\ny :"+y+"\nTotal xy: "+totalxy);
    }
                
    }

