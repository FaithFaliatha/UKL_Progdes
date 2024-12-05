/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ukl;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ukl {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Selamat datang di toko kami");
        
    int total = 0;
    int harga;

    System.out.println("Masukkan harga barang satu per satu (ketik 0 untuk selesai):");

    while (true) {
        System.out.print("Masukkan harga barang: Rp ");
        harga = scanner.nextInt();

        if (harga == 0) {
            break;
        }

        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif. Silakan masukkan harga yang valid.");
            continue;
        }

        total += harga; // Menambahkan harga ke total
    }

    System.out.println("\nBelanja = Rp " + total);

    System.out.print("Apakah anda member? (ya/tidak): ");
    String isMember = scanner.next();

    int diskon = 0;
    if (isMember.equalsIgnoreCase("ya")) {
        diskon = hitungDiskon(total);
    }

    int totalSetelahDiskon = total - diskon;

    if (diskon > 0) {
        System.out.println("Anda mendapatkan diskon sebesar Rp " + diskon);
    } else {
        System.out.println("Maaf, Anda tidak mendapatkan diskon.");
    }

    System.out.println("Total akhir = Rp " + totalSetelahDiskon);
}

public static int hitungDiskon(int total) {
    int diskon = 0;
    if (total > 200000) {
        diskon = (int) (total * 0.2);
    } else if (total > 100000) {
        diskon = (int) (total * 0.1);
    }
    return diskon;
}
}
        
        


