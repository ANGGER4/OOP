/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    private String nama;
    protected int kecepatanMaks;
    private String jenisMesin;

// constructor
public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
    this.nama = nama;
    this.kecepatanMaks = kecepatanMaks;
    this.jenisMesin = jenisMesin;
}

// Getter dan setter untuk variabel private nama
public String getNama() {
    return nama;
}
public void setNama(String nama){
    this.nama = nama;
}
// method public untuk menampilkan informasi kendaraan
public void infoKendaraan() {
    System.out.println("<===== Print Indormasi Kendaraan =====>");
    System.out.println("Nama Kendaraan: " + nama);
    System.out.println("Kecepatan Maksimum: " + kecepatanMaks );
    System.out.println("Jenis Mesin: " + jenisMesin);
    System.out.println("<===== Print Indormasi Kendaraan =====>");
}










/*// getter dan setter merk
public String getMerk() {
    return merk;
}
public void setMerk(String merk) {
    this.merk = merk;
}
// getter setter model
public String getModel() {
    return model;
}
public void setModel(String model) {
    this.model = model;
}
// getter setter tahun
public int getTahun() {
    return tahun;
}
public void setTahun(int tahun) {
    this.tahun = tahun;
}*/
}

