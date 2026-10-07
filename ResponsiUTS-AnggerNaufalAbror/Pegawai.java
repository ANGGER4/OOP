/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    // Constructor
    public Pegawai(String namaPegawai, int gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }    
    
    // Getter dan Setter
    public String getNama(){
        return namaPegawai;
    }
    public int getGaji(){
        return gaji;
    }
    public void setNama(String namaPegawai){
        this.namaPegawai = namaPegawai;
    }
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    
    // Method
    public void tampilkanInfo(){
        System.out.println("\n<===== Tampilkan Info =====>");
        System.out.println("Nama Pegawai: "+ namaPegawai);
        System.out.println("Gaji Pegawai: "+ gaji);
    }
}
