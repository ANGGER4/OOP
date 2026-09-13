/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 * @author ASUS
 */ 
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    
    // constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }
    
    // Method untuk info mobil
    public void tampilkanInfo() {
        System.out.println("Kecepatan maksimum mobil: "+ kecepatanMaks +" km/h");
        System.out.println("Jumlah Pintu mobil: "+ jumlahPintu);
    }

    // Tambahin main function biar bisa di run
    public static void main(String[] args) {
        // Kita harus membuat 'objek' mobilnya dulu untuk dites
        Mobil mobilku = new Mobil("Avanza", 160, "VVT-i", 4);
        
        // Memanggil method untuk menampilkan hasil
        mobilku.tampilkanInfo();
    }
}