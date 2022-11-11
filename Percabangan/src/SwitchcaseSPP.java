
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
public class SwitchcaseSPP {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan nama :");
        int pendapatan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah penghasilan :"));
        String jalurmasuk = JOptionPane.showInputDialog("Masukkan jalur masuk\nSNMPTN \nSBMPTN \nMandiri ");
        String KategoriPendapatan = null;
        
        if (pendapatan < 2000000){
        KategoriPendapatan = "A";
    }else if (pendapatan >= 2000000 && pendapatan <= 10000000){
        KategoriPendapatan = "B";
    }else if (pendapatan > 10000000){
        KategoriPendapatan = "C";
    }
        
        switch (jalurmasuk){
            case "SNMPTN":
                switch (KategoriPendapatan){
                    case "A":
                        JOptionPane.showMessageDialog(null, "DSP: 5 Juta\n SPP: 500 Rb");
                        break;
                    case "B":
                         JOptionPane.showMessageDialog(null, "DSP: 15 Juta\n SPP: 1 Juta");
                        break;
                    case "C":
                         JOptionPane.showMessageDialog(null, "DSP: 30 Juta\n SPP: 2 Juta");
                     }
         break;
            case "SBMPTN":
                switch (KategoriPendapatan){
                    case "A":
                         JOptionPane.showMessageDialog(null, "DSP: 7 Juta\n SPP: 500 Rb");
                         break;
                    case "B":
                         JOptionPane.showMessageDialog(null, "DSP: 17 Juta\n SPP: 1 Juta");
                         break;
                    case "C":
                         JOptionPane.showMessageDialog(null, "DSP: 35 Juta\n SPP: 2 Juta");
                     
                }
        break;
            case "Mandiri":
                switch (KategoriPendapatan){
                    case "A":
                        JOptionPane.showMessageDialog(null, "DSP: 10 Juta\n SPP: 1 juta");
                        break;
                    case "B":
                         JOptionPane.showMessageDialog(null, "DSP: 25 Juta\n SPP: 2 Juta");
                         break;
                    case "C":
                         JOptionPane.showMessageDialog(null, "DSP: 50 Juta\n SPP: 3 Juta");       
                }  
        break;
            default :
                JOptionPane.showMessageDialog(null, "Jalur masuk tidak terdaftar");
            
            
                
                
    }
    }
    
}
