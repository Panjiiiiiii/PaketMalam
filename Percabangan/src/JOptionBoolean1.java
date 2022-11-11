
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
public class JOptionBoolean1 {
    public static void main(String[] args) {
    String nama1 = JOptionPane.showInputDialog("Masukkan nama siswa 1 : ");   
    int nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai MTK "+nama1));
    String nama2 =  JOptionPane.showInputDialog("Masukkan nama siswa 2 :");
    int nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai MTK "+nama2));
    
    boolean pembanding1 = nilai1 < nilai2;
    boolean pembanding2 = nilai1 == nilai2;
   
        if (pembanding1==true) {
        JOptionPane.showMessageDialog(null,"Nilai "+nama1+" lebih kecil dari nilai "+nama2);
        }else if(pembanding2==true){
        JOptionPane.showMessageDialog(null,"Nilai "+nama1+" sama dengan nilai "+nama2);
        }else{
        JOptionPane.showMessageDialog(null, "Nilai "+nama1+" lebih kecil dari nilai "+nama2);
        }
        
      
    

            
    }
 
}
