
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
public class JOptionLuasLingkaran {
    public static void main(String[] args) {
     double jariJari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jariJari"));
     double luasLingkaran = 3.14*jariJari*jariJari;
     //JOptionPane.showMessageDialog(null, "Luas Lingkaran: "+luasLingkaran);
     JOptionPane.showMessageDialog(null, "Jari-jari: "+jariJari+"\nLuas Lingkaran: "+luasLingkaran);
    }
    
}
