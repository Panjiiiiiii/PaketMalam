
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 *
 * @author mokletgaming
 */
public class sppDSP {
    public static void main(String[] args) {
    String nama = JOptionPane.showInputDialog("Masukkan Nama :");
    String jalurmasuk = JOptionPane.showInputDialog ("Masukkan Jalur Masuk :");
    int pendapatan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Total Pendapatan Orang Tua :"));
    String KategoriPendapatan = null;
    
    if (pendapatan < 2000000){
        KategoriPendapatan = "A";
    }else if (pendapatan >= 2000000 && pendapatan <= 10000000){
        KategoriPendapatan = "B";
    }else if (pendapatan > 10000000){
        KategoriPendapatan = "C";
    }
    
    
    
   
    if (jalurmasuk.equalsIgnoreCase("SBMPTN")){
        if (KategoriPendapatan.equalsIgnoreCase("A")){
        JOptionPane.showMessageDialog(null, "DSP: 5 Juta\n SPP: 500 Rb");
        }else if (KategoriPendapatan.equalsIgnoreCase("B")){
        JOptionPane.showMessageDialog(null, "DSP: 15 Juta\n SPP: 1 Juta");
        }else if (KategoriPendapatan.equalsIgnoreCase("C")){
        JOptionPane.showMessageDialog(null, "DSP: 30 Juta\n SPP: 2 Juta");
        }
    }
    if (jalurmasuk.equalsIgnoreCase("SNMPTN")){
        if (KategoriPendapatan.equalsIgnoreCase("A")){
        JOptionPane.showMessageDialog(null, "DSP: 7 Juta\n SPP: 500 Rb");
        }else if (KategoriPendapatan.equalsIgnoreCase("B")){
        JOptionPane.showMessageDialog(null, "DSP: 17 Juta\n SPP: 1 Juta");
        }else if (KategoriPendapatan.equalsIgnoreCase("C")){
        JOptionPane.showMessageDialog(null, "DSP: 35 Juta\n SPP: 2 Juta");
        }
    }
    if (jalurmasuk.equalsIgnoreCase("Mandiri")){
        if (KategoriPendapatan.equalsIgnoreCase("A")){
        JOptionPane.showMessageDialog(null, "DSP: 10 Juta\n SPP: 1 juta");
        }else if (KategoriPendapatan.equalsIgnoreCase("B")){
        JOptionPane.showMessageDialog(null, "DSP: 25 Juta\n SPP: 2 Juta");
        }else if (KategoriPendapatan.equalsIgnoreCase("C")){
        JOptionPane.showMessageDialog(null, "DSP: 50 Juta\n SPP: 3 Juta");
        }
        
    
    
    }
    }
}

                
        
        
   
    


    
