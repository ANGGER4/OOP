/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author ASUS
 */
public class Mobil {
    // Instances variable menggunakan encapsulation
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    // Membuat constructor
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
        
    }
    // Getter dan Setter untuk merk
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    // Getter dan setter untuk model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    // getter dan setter untuk tahun mobil
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    // Getter dan setter untuk warna
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    //Method
    void displayInfo() {
        System.out.println("<====== Informasi Detail Mobil =====>");
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
        System.out.println("<====== Informasi Detail Mobil =====>");
    }
    
    void startEngine(){
        System.out.println("Mesin mobil " + merk + " menyala!!");
    }
}
