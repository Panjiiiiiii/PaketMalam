
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
public class BahanMasakan {
    public static void main(String[] args) {
        String nama;
        String alamat;
        String bahan1;
        String bahan2;
        String bahan3;
        
       nama = JOptionPane.showInputDialog("Masukkan nama anda :");
       alamat = JOptionPane.showInputDialog("Masukkan alamat anda");
       JOptionPane.showInputDialog(null, "Tekan OK untuk memulai :");
       
       bahan1 = JOptionPane.showInputDialog("Masukkan bahan 1 \n1. Nasi \n2. Ayam \n3. Bumbu");
       bahan2 = JOptionPane.showInputDialog("Masukkan bahan 2 \n1. Telur \n2. Mie \n3. Sambal");
       bahan3 = JOptionPane.showInputDialog("Masukkan bahan 3 \n1. Bumbu nasgor \n2. Air \n3. Nasi");
       
       switch (bahan1){
           case "Nasi" :
               if (bahan2.equalsIgnoreCase("Telur")){
                   if (bahan3.equalsIgnoreCase("Bumbu nasgor")){
                       JOptionPane.showMessageDialog(null, "Menu = nasi goreng");
                   }
               }
               break;
           case "Ayam" :
               if (bahan2.equalsIgnoreCase("Mie")){
                   if (bahan3.equalsIgnoreCase("Air")){
                       JOptionPane.showMessageDialog(null, "Menu = Mie ayam");
                   }
                   
               }else if (bahan2.equalsIgnoreCase("Sambal")){
                   
               }if (bahan3.equalsIgnoreCase("Nasi")){
                   JOptionPane.showMessageDialog(null, "Menu = Ayam Geprek");
               }
       }
    }
    
}
