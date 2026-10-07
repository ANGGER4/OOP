/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ASUS
 */
public class Produk {
    private String namaProduk;
    private int harga;
    
    // Constructor
    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // Getter dan Setter
    public String getNama(){
        return namaProduk;
    }
    public int getHarga(){
        return harga;
    }
    public void setNama(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    // Method
    public void tampilkanInfo(){
        System.out.println("\n<===== Tampilkan Info =====>");
        System.out.println("Nama Produk: "+ namaProduk);
        System.out.println("Harga Produk: "+ harga);
    }
}
