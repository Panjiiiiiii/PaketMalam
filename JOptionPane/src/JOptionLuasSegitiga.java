
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
public class JOptionLuasSegitiga {
    public static void main(String[] args) {
    double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas"));   
    double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masaukkan tinggi"));
    double luasSegitiga = 0.5*alas*tinggi;
    //JOptionPane.showMessageDialog(null, "Luas Segitiga :"+ luasSegitiga);
    JOptionPane.showMessageDialog(null, "Alas: "+alas+"\nTinggi: "+tinggi+"\nLuas Segititga: "+luasSegitiga);
    }
    }
    

