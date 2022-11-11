
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
public class JOptionLuasPersegiPanjang {
    public static void main(String[] args) {
        double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang"));
        double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar"));
        double luasPersegiPanjang = panjang*lebar;
        //JOptionPane.showMessageDialog (null, "Luas Persegi Panjang: "+luasPersegiPanjang);
        JOptionPane.showMessageDialog(null, "Panjang :"+panjang+"\nLebar :"+lebar+"\nLuas Persegi Panjang :"+luasPersegiPanjang);
    }
   
}
