/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class KeranjangBelanja {
    ArrayList<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotal() {
        double total = 0;

        for (Produk produk : daftarProduk) {
            total += produk.getHarga() - produk.hitungDiskon();
        }

        return total;
    }
}
