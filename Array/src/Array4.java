/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class Array4 {
    public static void main(String[] args) {
        String [][] nama = {{"Alya", "18765"}, {"Aladin", "11876"}, {"Nala", "17622"}, {"Wawan", "29988"}, {"Setya", "98765"}}; 
        
        for (int x = 0; x < nama.length; x++) {
            System.out.println("Nama: "+nama[x][0]);
            System.out.println("Id: "+nama [x][1]);
            System.out.println("================");
            
        }
    }
}
