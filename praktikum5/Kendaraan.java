/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    String nama;
    protected int kecepatan;
    
    //Constructor
    public Kendaraan(String nama, int kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;
    }
    
    //method tampilkanInfo()
    public void tampilkanInfo(){
        System.out.println("nama: "+ nama);
        System.out.println("kecepaan: "+ kecepatan);
    }
    
}
