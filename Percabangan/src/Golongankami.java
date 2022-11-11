
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
public class Golongankami {
    public static void main(String[] args) {
        String asal;
        String tujuan;
        String kendaraan;
        
        asal = JOptionPane.showInputDialog("Masukkan asal anda (Waru, Sidoarjo, Porong)");
        tujuan = JOptionPane.showInputDialog("Masukkan tujuan anda (Waru, Sidoarrjo, Porong)");
        kendaraan = JOptionPane.showInputDialog("Masukkan kendaraan \n1. Golongan I (Sedan, jip, pick up, dan bus) \n2. Golongan II (Truk besar 2 gandar)");
        
       switch (kendaraan){
           case "Golongan 1" :
               if (asal.equalsIgnoreCase("Waru")){
                   if (tujuan.equalsIgnoreCase("Sidoarjo")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 6000");
                   }else if (tujuan.equalsIgnoreCase("Porong")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 9000");
               }
                }else if (asal.equalsIgnoreCase("Sidoarjo")){
                   if (tujuan.equalsIgnoreCase("Waru")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 6000");
                   }else if (tujuan.equalsIgnoreCase("Porong")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 5500");
                   }
                }else if (asal.equalsIgnoreCase("Poronng")){
                   if (tujuan.equalsIgnoreCase("Sidoarjo")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 5500");
                   }else if (tujuan.equalsIgnoreCase("Paru")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 9000"); 
                   }
                }
                   break;
            case "Golongan 2" :
               if (asal.equalsIgnoreCase("Waru")){
                   if (tujuan.equalsIgnoreCase("Sidoarjo")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 9000");
                   }else if (tujuan.equalsIgnoreCase("Porong")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 14000");
               }
                }else if (asal.equalsIgnoreCase("Sidoarjo")){
                   if (tujuan.equalsIgnoreCase("Waru")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 9000");
                   }else if (tujuan.equalsIgnoreCase("Porong")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 8500");
                   }
                }else if (asal.equalsIgnoreCase("Poronng")){
                   if (tujuan.equalsIgnoreCase("Sidoarjo")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 8500");
                   }else if (tujuan.equalsIgnoreCase("Paru")){
                       JOptionPane.showMessageDialog(null, "Asal : "+asal+"\nTujuan : "+tujuan+"\nGolongan kendaraan : "+kendaraan+"Harga : 14000"); 
                   }
       }}}}
