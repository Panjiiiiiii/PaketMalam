
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
public class Checkout {
    public static void main(String[] args) {
        int jumlahjenis = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah jenis barang 1/2/3 :"));
        int totalakhir = 0;
        
       
        
        
       if (jumlahjenis == 1){
        String namabarang = JOptionPane.showInputDialog("Masukkan Jenis Barang\n1. Tas\n2. Laptop\n3. Buku ");
        if (namabarang.equalsIgnoreCase("Tas")){
            int jumlahtas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah tas :"));
            int totaltas = jumlahtas*100000;
             totalakhir=totaltas;
        }else if (namabarang.equalsIgnoreCase("Laptop")){
           int jumlahlaptop = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah laptop :"));
           int totallaptop = jumlahlaptop*7000000;
            totalakhir=totallaptop;
        }else if (namabarang.equalsIgnoreCase("Buku")){
           int jumlahbuku = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Buku :"));
           int totalbuku = jumlahbuku*50000;
            totalakhir=totalbuku;
       }
       }
        
        if (jumlahjenis == 2){
        String namabarang2 = JOptionPane.showInputDialog("Masukkan 2 Jenis Barang\n1. Tas\n2. Laptop\n3. Buku");
        if (namabarang2.equalsIgnoreCase("Tas dan buku")){
            int jumlahtasbuku1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah tas :"));
            int jumlahtasbuku2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Buku :"));
            int total2tasbuku = (jumlahtasbuku1*100000)+(jumlahtasbuku2*50000);
            int totalakhir2 = total2tasbuku;
        }else if (namabarang2.equalsIgnoreCase("Laptop dan buku")){
            int jumlahlaptopbuku1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Laptop :"));
            int jumlahlaptopbuku2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah buku :"));
            int total2laptopbuku = (jumlahlaptopbuku1*7000000)+(jumlahlaptopbuku2*50000);
            int totalakhir2 = total2laptopbuku;
        }else if (namabarang2.equalsIgnoreCase("Tas dan Laptop")){
            int jumlahtaslaptop1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah tas :"));
            int jumlahtaslaptop2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah laptop :"));
            int total2taslaptop = (jumlahtaslaptop1*100000)+(jumlahtaslaptop2*7000000);
            int totalakhir2 = total2taslaptop;
        }
        }
        
       if (jumlahjenis == 3){
            int jumlah31 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah tas :"));
            int jumlah32 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah laptop :"));
            int jumlah33 = Integer.parseInt(JOptionPane.showInputDialog ("Masukkan jumlah buku :"));
            int total3 = (jumlah31*100000)+(jumlah32*7000000)+(jumlah33*50000);
              int totalakhir3 = total3;
        }
       
       String lokasitoko = JOptionPane.showInputDialog("Masukkan lokasi toko (Madura) ");
       String lokasitujuan = JOptionPane.showInputDialog("Masukkan lokasi tujuan pengiriman\n1. Surabaya\n2. Malang\n3. Kediri\n4. Mojokerto");
       
       if (lokasitujuan.equalsIgnoreCase("Surabaya")){
           int ongkir = 11190;
           if (jumlahjenis ==1 ){
               int checkout1 =totalakhir + ongkir;
               
               
           }
    
           
       }else if (lokasitujuan.equalsIgnoreCase("Malang")){
           int ongkir = 21050;
           
       }else if (lokasitujuan.equalsIgnoreCase("Kediri")){
           int ongkir = 23450;
           
       }else if (lokasitujuan.equalsIgnoreCase("Mojokerto")){
           int ongkir = 16270;
           
       }
         
       
    }
}
