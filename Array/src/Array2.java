/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class Array2 {

    public static void main(String[] args) {
        String[] namasiswa = new String [4];
        namasiswa [0] = "Dea";
        namasiswa [1] = "A";
        namasiswa [2] = "B";
        namasiswa [3] = "C";

        int pilihan = 1;

        if (pilihan <= 4) {
            System.out.println(namasiswa[pilihan]);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
