
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
public class Checkout3 {
    public static void main(String[] args) {
        String nama;
        String usn;
        int buku;
        int tas;
        int laptop;
        nama = JOptionPane.showInputDialog("Masukkan nama anda :");
        usn = JOptionPane.showInputDialog("Masukkan username anda :");
        buku = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah buku"));
        tas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah tas"));
        laptop = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah laptop"));
        
        int hargabuku = 50000;
        int hargatas = 100000;
        int hargalaptop = 10000000;
        
        int total = (buku*hargabuku)+(tas*hargatas)+(laptop*hargalaptop);
        
        String lokasitoko = "Madura";
        
        String tujuan = JOptionPane.showInputDialog("Masukkan lokasi tujuan \n1. Surabaya \n2. Malang \n3. Kediri \n4. Mojokerto :");
        
        if (tujuan.equalsIgnoreCase("Surabaya")){
            int ongkosSBY = 11190;
            int Surabaya = total + ongkosSBY;
            JOptionPane.showMessageDialog(null, "Nama anda "+nama+"\nUsername anda : "+usn+"\nBuku "+buku+" unit"+"\nTas "+tas+" unit"+"\nLaptop "+laptop+" unit");
            JOptionPane.showMessageDialog(null, "Lokasi toko : "+lokasitoko+"\nTujuan : "+tujuan);
            JOptionPane.showMessageDialog(null, "Total harga barang : "+total+"\nOngkir : "+ongkosSBY+"\nTotal yang dibayar : "+Surabaya);
        }else if (tujuan.equalsIgnoreCase("Malang")){
               int ongkosMLG = 21050;
               int Malang = total + ongkosMLG;
            JOptionPane.showMessageDialog(null, "Nama anda "+nama+"\nUsername anda : "+usn+"\nBuku "+buku+" unit"+"\nTas "+tas+" unit"+"\nLaptop "+laptop+" unit");
            JOptionPane.showMessageDialog(null, "Lokasi toko : "+lokasitoko+"\nTujuan : "+tujuan);
            JOptionPane.showMessageDialog(null, "Total harga barang : "+total+"\nOngkir : "+ongkosMLG+"\nTotal yang dibayar : "+Malang);
        }else if (tujuan.equalsIgnoreCase("Kediri")){
               int ongkosKDR = 23450;
               int Kediri = total + ongkosKDR;
            JOptionPane.showMessageDialog(null, "Nama anda "+nama+"\nUsername anda : "+usn+"\nBuku "+buku+" unit"+"\nTas "+tas+" unit"+"\nLaptop "+laptop+" unit");
            JOptionPane.showMessageDialog(null, "Lokasi toko : "+lokasitoko+"\nTujuan : "+tujuan);
            JOptionPane.showMessageDialog(null, "Total harga barang : "+total+"\nOngkir : "+ongkosKDR+"\nTotal yang dibayar : "+Kediri);
        }else if (tujuan.equalsIgnoreCase("Mojokerto")){
               int ongkosMJK = 16270;
               int Mojokerto = total + ongkosMJK;
            JOptionPane.showMessageDialog(null, "Nama anda "+nama+"\nUsername anda : "+usn+"\nBuku "+buku+" unit"+"\nTas "+tas+" unit"+"\nLaptop "+laptop+" unit");
            JOptionPane.showMessageDialog(null, "Lokasi toko : "+lokasitoko+"\nTujuan : "+tujuan);
            JOptionPane.showMessageDialog(null, "Total harga barang : "+total+"\nOngkir : "+ongkosMJK+"\nTotal yang dibayar : "+Mojokerto);
        }
    }
  
}
