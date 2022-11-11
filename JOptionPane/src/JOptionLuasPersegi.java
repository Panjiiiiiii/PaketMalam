
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
public class JOptionLuasPersegi {
    public static void main(String[] args) {
        double sisi = Double.parseDouble (JOptionPane.showInputDialog("Masukkan sisi"));
        double luasPersegi = sisi*sisi;
        //JOptionPane.showMessageDialog(null, "Luas Persegi: "+luasPersegi);
        JOptionPane.showMessageDialog(null, "Sisi: "+sisi+"\nLuas persegi: "+luasPersegi);
    }
    
}
