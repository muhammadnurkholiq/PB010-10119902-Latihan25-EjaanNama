/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010.pkg10119902.latihan25.ejaannama;

import java.util.Scanner;

/**
 * 
 * @author
 * NAMA     : Muhammad Nurkholiq
 * KELAS    : IF-10K
 * NIM      : 10119902
 * Deskripsi Program : Program ini berisi program untuk Ejaan Nama
 * 
 */

public class PB01010119902Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String nama;
        int jumlahKarakterNama;

        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scanner.nextLine();

        jumlahKarakterNama = nama.length();

        char[] ch = new char[jumlahKarakterNama];

        System.out.println("Ejaan untuk nama '" + nama + "' adalah :");
        
        for (int i = 0; i < jumlahKarakterNama; i++) 
        {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
    }
    
}
