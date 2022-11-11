
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
public class Ratarata {
    public static void main(String[] args) {
        
        int jumlahnilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah nilai"));
        int totalnilai = 0;
        for (int i = 1; i <= jumlahnilai; i++) {
            int nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai "+i)); 
            totalnilai+=nilai;
            
            
           
        
            
        }
        int ratarata= totalnilai/jumlahnilai;
        JOptionPane.showMessageDialog(null, "Rata-rata nilai : "+ratarata);
    }
}
