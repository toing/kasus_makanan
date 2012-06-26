/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.Yana;

import java.awt.Menu;
import java.util.Scanner;

/**
 *
 * @author Toin9
 */
public class Studi_kasus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int menu, porsi, pesanan, status, jumlah;
        double harga, subtotal, totalharga, diskon, pajak, totalbayar;
        String pilihan;


        harga = 0;
        totalharga = 0;
        diskon = 0;
        totalbayar = 0;
        pajak = 0;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Menu Makanan");
        System.out.println("=========================");
        System.out.println("1.Spaghetti Beef");
        System.out.println("2.Fettucine Mushroom");
        System.out.println("3.Spaghetti with garlic");
        System.out.print("Masukan menu makanan : ");
        menu = scanner.nextInt();


        System.out.println("=========================");
        System.out.println("Porsi Makanan");
        System.out.println("1.Kecil");
        System.out.println("2.Sedang");
        System.out.println("3.Besar");
        System.out.print("Masukan porsi makanan : ");
        porsi = scanner.nextInt();


        System.out.println("=========================");
        System.out.println("Status Pesanan");
        System.out.println("1.Makan Ditempat");
        System.out.println("2.Dibungkus");
        System.out.print("Masukan status pesanan : ");
        status = scanner.nextInt();

        System.out.print("\n");
        System.out.print("Jumlah Pesanan : ");
        jumlah = scanner.nextInt();


        if (menu == 1 && porsi == 1) {
            harga = 8000;
        } else if (menu == 1 && porsi == 2) {
            harga = 10000;
        } else if (menu == 1 && porsi == 3) {
            harga = 15000;
            diskon = 0.05 * harga * diskon;
        }

        if (menu == 2) {
            switch (porsi) {
                case 1:
                    harga = 9000;
                    break;
                case 2:
                    harga = 11000;
                    break;
                case 3:
                    harga = 16000;
                    break;
            }
        }
        if (menu == 3) {
            if (porsi == 1) {
                harga = 5000;
            } else if (porsi == 2) {
                harga = 9000;
            } else if (porsi == 3) {
                harga = 12000;
                diskon = 0.1 * harga * jumlah;
            }
        }


        subtotal = jumlah * harga;
        totalharga = subtotal - diskon;

        if (status == 1) {
            pajak = 0.1 * totalharga;
        }
        totalbayar = totalharga + pajak;


        System.out.println("\n\n Hasil Pesanan");
        System.out.println("=========================");
        System.out.println("Subtotal\t:" + subtotal);
        System.out.println("Diskon\t\t: " + diskon);
        System.out.println("Total Harga: " + totalharga);
        System.out.println("Pajak\t\t\t: " + pajak);
        System.out.println("Total Bayar\t\t: " + totalbayar);
    }
}
