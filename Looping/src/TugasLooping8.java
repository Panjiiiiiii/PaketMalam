
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class TugasLooping8 {
    public static void main(String[] args) {
        int nilaiawal;
        int nilaiakhir;
        int kelipatan;
        int totalbilangan= 0;
        
//        nilaiawal= Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai awal"));
//        nilaiakhir= Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai akhir"));
//        kelipatan= Integer.parseInt(JOptionPane.showInputDialog("Masukkan kelipatan"));

           Scanner scan=new Scanner (System.in);
           System.out.println("Masukkan nilai awal");
           nilaiawal= scan.nextInt();
           System.out.println("Masukkan nilai akhir");
           nilaiakhir= scan.nextInt();
           System.out.println("Masukkan kelipatan bilangan");
           kelipatan= scan.nextInt();
           System.out.println();
        
        for (int i = nilaiawal; i <= nilaiakhir; i+=kelipatan) {
            System.out.println(i);
            totalbilangan +=i;
        }
        
        System.out.println("Total bilangan adalah "+totalbilangan);
    }
}
