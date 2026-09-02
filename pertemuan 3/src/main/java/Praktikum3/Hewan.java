/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author ASUS
 */
public class Hewan {
    String nama;
    int umur;
    
    // Constructor

    /**
     *
     * @param nama
     * @param umur
     */
    public Hewan(String nama, int umur) {
    this.nama = nama;
    this.umur = umur;
}
    // getter dan Setter
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    //Method
    void suara() {
        System.out.println("Suara hewan");
    }
    void info() {
        System.out.println("Nama: " + getNama() + ", Umur:" + getUmur());
    }
    void lari() {
        System.out.println("Hewan sedang mlayu");
    }
}
