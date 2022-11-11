
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
public class JOPtionSatSetTambah {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai x"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai Y"));
        double tambah = x+y;
     //JOptionPane.showMessageDialog(null, "Sat set tambah: "+tambah);
     JOptionPane.showMessageDialog(null, "Nilai X: "+x+"\nNilai Y:"+y+"\nNilai X+Y :"+tambah);
    }
}
