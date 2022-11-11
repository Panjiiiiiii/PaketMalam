
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
public class Matrix {
    public static void main(String[] args) {
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah baris"));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah kolom"));
        
        for (int i = 0; i <baris; i++) {
            for (int j = 0; j <kolom; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
}
