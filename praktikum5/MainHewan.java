/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class MainHewan {
    public static void main(String[] args) {
        // Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Momo";
        kucing.jenis = "Mamalia (Kucing Anggora)";
        kucing.tampilkanInfo();

        System.out.println("--------------------");

        // Objek Anjing
        Anjing anjing = new Anjing();
        anjing.nama = "Rocky";
        anjing.jenis = "Mamalia (Anjing Beagle)";
        anjing.tampilkanInfo();
    }
}
