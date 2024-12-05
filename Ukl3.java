/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl3;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ukl3 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        
        int[] hariHadir = new int[jumlahSiswa];

        // Mengumpulkan data kehadiran siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            hariHadir[i] = scanner.nextInt();
        }

        // Menghitung total hari hadir dan rata-rata kehadiran
        double totalHariHadir = hitungTotalHariHadir(hariHadir);
        double rataRataKehadiran = totalHariHadir / jumlahSiswa;

        // Menampilkan total dan rata-rata
        System.out.println("Total hari hadir: " + totalHariHadir);
        System.out.println("Rata-rata kehadiran: " + rataRataKehadiran);

        // Menampilkan kesimpulan siswa di atas dan di bawah rata-rata
        System.out.println("\nKesimpulan:");
         System.out.println("Kesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] > rataRataKehadiran) {
                System.out.println("- Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }
        System.out.println("- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
        if (hariHadir[i] < rataRataKehadiran) {
                System.out.println("- Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            
            }
        }

        
    }

    // Fungsi untuk menghitung total hari hadir
    public static double hitungTotalHariHadir(int[] hariHadir) {
        double total = 0;
        for (int i = 0; i < hariHadir.length; i++) {
            total += hariHadir[i];
        }
        return total;
    }
}
  