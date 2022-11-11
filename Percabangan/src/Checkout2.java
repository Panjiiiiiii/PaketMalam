
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
public class Checkout2 {
    public static void main(String[] args) {
        String nama ;
        String namaacc ;
        
        nama = JOptionPane.showInputDialog("Masukkan nama :");
        namaacc = JOptionPane.showInputDialog("Masukkan username akun :");
        
        String item ;
        item = JOptionPane.showInputDialog("Masukkan unit item (1/2/3) :");
        
        switch (item){
            case "1" :
                String jenis;
                int total1 = 0;
                
                jenis = JOptionPane.showInputDialog("Pilih 1 item (Tas/Buku/Laptop) :");
                switch (jenis){
                    case "Tas" :
                        int hanyatas ;
                        hanyatas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah tas"));
                        int hargatas ;
                        hargatas = hanyatas*100000;
                        total1 = hargatas;
                        break;
                    case "Buku" :
                        int hanyabuku ;
                        hanyabuku = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah buku"));
                        int hargabuku ;
                        hargabuku = hanyabuku*50000;
                        total1 = hargabuku;
                        break;
                    case "Laptop" :
                        int hanyalaptop ;
                        hanyalaptop = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah laptop"));
                        int hargalaptop ;
                        hargalaptop = hanyalaptop*1000000;
                        total1 = hargalaptop;
                        break;
                   
                }
            break;
            case "2" :
                String jenis2;
                jenis2 = JOptionPane.showInputDialog("Pilih 2 item (Tas/Buku/Laptop)");
                switch (jenis2){
                    case "Tas dan buku" :
                        int hanyatasbuku ;
                        int hanyatasbuku2;
                        hanyatasbuku = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah tas"));
                        hanyatasbuku2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah buku :"));
                        int hargatasbuku = (hanyatasbuku*100000)+(hanyatasbuku*50000);
                        int totaltasbuku = hargatasbuku ;
                        break;
                    case "Tas dan laptop" :
                        int hanyataslaptop ;
                        int hanyataslaptop2 ;
                        hanyataslaptop = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah tas"));
                        hanyataslaptop2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah laptop"));
                        int hargataslaptop = (hanyataslaptop*100000)+(hanyataslaptop2*10000000);
                        int totaltaslaptop = hargataslaptop ;
                        break;
                    case "Buku dan laptop" :
                        int hanyabukulaptop ;
                        int hanyabukulaptop2 ;
                        hanyabukulaptop = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah buku"));
                        hanyabukulaptop2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah laptop"));
                        int hargabukulaptop = (hanyabukulaptop*100000)+(hanyabukulaptop2*10000000);
                        int totalbukulaptop = hargabukulaptop ;
                        break;
                        
                }
            break;
            case "3" :
                String jenis3;
                int totaltas;
                int totalbuku;
                int totallaptop;
                totaltas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah tas"));
                totalbuku = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah buku"));
                totallaptop = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah laptop"));
                int harga3item = (totaltas*100000)+(totalbuku*50000)+(totallaptop*10000000);
                int total3 = harga3item;
                
            break;
            default :
                JOptionPane.showMessageDialog(null, "Maaf pesanan "+namaacc+" tidak tersedia");
            
        } 
        String asaltoko;
        String lokasitujuan;
        asaltoko = JOptionPane.showInputDialog("Masukkan toko asal Madura :");
        lokasitujuan = JOptionPane.showInputDialog("Masukkan kota tujuan \n1. Surabaya \n2. Malang \3. Kediri \4. Mojokerto :");
        
        switch (lokasitujuan){
            case "Surabaya" :
                int sby = 11190;
                

        }
    }
    
}
