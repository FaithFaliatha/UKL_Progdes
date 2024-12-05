/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ukl2 {

    
    public static double hitungLuasPermukaanBola(double r) {
        final double PI = Math.PI;
        return 4 * PI * r * r; // Menghitung luas permukaan bola
    }

    public static double hitungLuasLingkaran(double r) {
        final double PI = Math.PI;
        return PI * r * r; // Menghitung luas lingkaran
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lagi; // Variabel untuk menanyakan kepada pengguna apakah ingin menghitung lagi

        do {
            System.out.print("Masukkan jari-jari: ");
            double jariJari = scanner.nextDouble();

            // Menghitung luas lingkaran
            double luasLingkaran = hitungLuasLingkaran(jariJari);
            System.out.printf("Luas lingkaran dengan jari-jari %.2f adalah %.2f%n", jariJari, luasLingkaran);

            // Menghitung luas permukaan bola
            double luasPermukaanBola = hitungLuasPermukaanBola(jariJari);
            System.out.printf("Luas permukaan bola dengan jari-jari %.2f adalah %.2f%n", jariJari, luasPermukaanBola);

            // Menanyakan kepada pengguna apakah ingin menghitung lagi
            System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            lagi = scanner.next();
        } while (lagi.equalsIgnoreCase("ya")); // Loop akan terus berjalan jika pengguna menjawab "ya"

        scanner.close(); // Menutup scanner
    }
}
        
        
       

