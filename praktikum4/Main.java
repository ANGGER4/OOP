/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        pekerja karyawan = new pekerja("Revan", 20, "Ternak Lele", 20000);
        
        // Menampilkan objek ang baru saja dibuat
        System.out.println(karyawan.toString());
        
        // Mengubah nama pekerja
        karyawan.setNama("Henji");
        System.out.println("\n -----Informasi Karyawan terbaru------");
        System.out.println(karyawan.toString());
        
        // Uji akses atribut
        System.out.println("--- Uji Akses Langsung Atribut ---");
        System.out.println(karyawan.nama); 
        System.out.println(karyawan.usia); 
        System.out.println(karyawan.gaji);
    }
}
