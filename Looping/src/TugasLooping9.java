
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
public class TugasLooping9 {
    public static void main(String[] args) {
        String nama;
        int hurufi;
        int totali=0;
        
         nama = JOptionPane. showInputDialog("Masukkan nama");
         hurufi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah huruf i pada nama"+ nama));
         
         for (int i = 1; i <= hurufi; i++) {
             System.out.println("i");
             totali+=i;
        }
         
         JOptionPane.showMessageDialog(null, "Jumlah i adalah"+hurufi);
         
    }
}
