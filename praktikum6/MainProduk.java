/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */

public class MainProduk {

    public static void main(String[] args) {

        Buku buku = new Buku("Pemrograman Java", 100000);
        Elektronik elektronik = new Elektronik("Keyboard", 500000);
        Pakaian pakaian = new Pakaian("Jaket", 250000);

        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        System.out.println("Total setelah diskon: Rp" + keranjang.hitungTotal());
    }
}