/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Produk produk2 = new Makanan("Dimsum", 13000, 4);
        Pegawai pegawai1 = new PegawaiTetap("Gavin", 2000000, 350000);
        Pegawai pegawai2 = new PegawaiKontrak("Revan", 2000000, 12);
        
    // Panggil produk
    produk1.tampilkanInfo();
    produk2.tampilkanInfo();
    pegawai1.tampilkanInfo();
    pegawai2.tampilkanInfo();
    }
    
}
