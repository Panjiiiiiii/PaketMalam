/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikuminputdata;

import javax.swing.JOptionPane;

/**
 *
 * @author mokletgaming
 */
public class Tugas1 {
    public static void main(String[] args) {
    Double r= Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari :"));
    Double t= Double.parseDouble(JOptionPane.showInputDialog("Masukkan Tinggi"));
    Double luas= 2*3.14*r*(r+t);
    Double volume= 3.14*r*r*t;
    JOptionPane.showMessageDialog(null, "Luas permukaan tabung :"+luas+"\nVolume tabung :"+volume);
        
        
    
    }
    
}
