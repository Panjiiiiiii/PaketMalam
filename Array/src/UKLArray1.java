
import java.util.Scanner;
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
public class UKLArray1 {
    public static void main(String[] args) {
//        Type data

        String [] nama = {"Panji", "Inad", "Raffy", "Ridho"};
        String [] nisn = {"1111", "2222", "3333", "4444"};
        String [] kelas = {"R1", "R2", "R3", "R4"};
        String [][] kelompokdata = {nama, nisn, kelas};
        int valuedata= 0;
//        Masukkan input pilihan

        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pilihan berikut: \n1. Tampilkan semua \n.2. Ambil data"));
        switch (pilihan){
            //Matrix data
            case 1 :
                for (int i = 0; i <= kelompokdata.length; i++) {
                    System.out.println("Nama : "+kelompokdata[0][i]);
                    System.out.println("NISN : "+kelompokdata [1][i]);
                    System.out.println("Kelas :"+kelompokdata [2][i]);
                    System.out.println("=============");
                }
            break;
            
            case 2 :
//        Masukkan data
                
        String input = JOptionPane.showInputDialog("Masukkan Nama/Nisn/Kelas :");
//       Read data
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (input.equalsIgnoreCase(kelompokdata [i][j])){
                    //Output//
                    JOptionPane.showMessageDialog(null, 
                            "Nama "+ kelompokdata [0][j] + 
                            "\nNisn "+ kelompokdata [1][j] + 
                            "\nKelas "+kelompokdata [2][j]);
                    valuedata= 1;
                }  
            }
        }
        if (valuedata == 0){
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }
        break;
        
        }

    }
        
}
