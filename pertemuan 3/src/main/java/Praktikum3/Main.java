/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        //Memakai constructornya
      /*  Hewan kucing = new Hewan("Coco", 3);
        kucing.suara();
        kucing.info();
        
        System.out.println();
        
        // buat objek lainnya
        Hewan kucing2 = new Hewan("Cici", 2);
        kucing2.lari(); */
     
     // Membuat 2 object
        Mobil sport = new Mobil("Ferarri ", "sf90 stradale", 2021, "Merah");
        Mobil lcgc = new Mobil("Avanza", "veloz", 2026, "Hitam");
        
        sport.displayInfo();
        
        sport.setWarna("Hitam");
        sport.displayInfo();
       
        lcgc.startEngine(); 
        
    }
}
