
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
public class latihanJOption {
    public static void main(String[] args) {
    String nama=JOptionPane.showInputDialog("Masukkan nama : ");
    String kelas=JOptionPane.showInputDialog("Masukkan kelas :");
    String absen=JOptionPane.showInputDialog("Masukkan nomor presensi :");
    JOptionPane.showMessageDialog(null, "Nama Saya :"+nama+"\nKelas Saya :"+kelas+"\nPresensi Saya :"+absen);
    }

}
