
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
public class Assetbarang {
    public static void main(String[] args) {
    int laptop = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah laptop :"));
    int hardisk = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah hardisk :"));
    int mouse = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah mouse :"));
    
    int hargalaptop = 10000000;
    int hargahardisk = 1500000;
    int hargamouse = 150000;
    
    int jumlah1 = laptop*hargalaptop;
    int jumlah2 = hardisk*hargahardisk;
    int jumlah3 = mouse*hargamouse;
    
         
    int pilihan= Integer.parseInt(JOptionPane.showInputDialog("Masukkan pilihan 1/2 :"));
    
    switch (pilihan) {
        case 1:
             int totalasset = jumlah1+jumlah2+jumlah3; 
            JOptionPane.showMessageDialog(null, "Total harga asset adalah : "+totalasset);
            break;
        case 2:
               boolean pembanding1 = jumlah1 > jumlah2;
    
        if (jumlah1 > jumlah2) {
            if (jumlah1 > jumlah3) {
            JOptionPane.showMessageDialog(null, "Yang paling banyak adalah laptop");
            }else{
            JOptionPane.showMessageDialog(null, "Yang paling banyak adalah mouse");
            }
            }else if (jumlah2 > jumlah3) {
            JOptionPane.showMessageDialog(null, "Yang paling banyak adalah harddisk");
            }else{
            JOptionPane.showMessageDialog(null, "Yang paling banyak adalah mouse");
            } 
        
    }
    
   
    }
    
}
