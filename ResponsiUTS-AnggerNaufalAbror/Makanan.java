/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ASUS
 */
public class Makanan extends Produk {
    int exp;
    
    public Makanan(String namaProduk, int harga, int exp){
        super(namaProduk, harga);
        this.exp = exp;
    }
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Kadaluarsa: "+ exp);
        System.out.println("<===== Tampilkan Info =====>\n");
    }
}
