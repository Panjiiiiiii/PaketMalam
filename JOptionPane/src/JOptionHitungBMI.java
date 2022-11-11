
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
public class JOptionHitungBMI {
    public static void main(String[] args) {
        //Rumus: Berat (Kg) / (Tinggi (m)*tinggi (m) )
        String nama = JOptionPane.showInputDialog("Masukkan nama: ");
        double berat = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Berat (Kg) : "));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Tinggi (M) : "));
        double bmi = berat / (tinggi*tinggi);
        //JOptionPane.showMessageDialog(null, "Nama anda adalah: "+nama +"\n BMI anda adalah: "+ bmi);
      //  JOptionPane.showMessageDialog(null, "BMI anda adalah: "+bmi);
      JOptionPane.showMessageDialog(null, "Nama Saya: "+nama+"\nBerat Saya: "+berat+"\nTinggi saya :"+tinggi+"\nBMI saya: "+bmi);
    }
   
}
