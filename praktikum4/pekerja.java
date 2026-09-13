/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class pekerja extends Manusia{
    private int gaji;
    
    //constructor
    public pekerja(String nama, int usia, String pekerjaan, int gaji){
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    // getter dan setter gaji
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    // Method toStrig() buat nampilin semua
    @Override
    public String toString(){
        return """
               <===== Informasi Karyawan =====>
               Nama: """ + nama + "\n" +
               "Usia: " + usia + "\n" +
               "Pekerjaan: " + pekerjaan + "\n" +
               "Gaji: " + gaji + "\n" +
               "<===== Informasi Karyawan =====>";
    }
    
    
}
