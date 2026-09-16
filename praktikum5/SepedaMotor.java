/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class SepedaMotor extends Kendaraan {
    public String jenisMesin;
    
    //constructor
    public SepedaMotor(String nama, int kecepatan) {
        super(nama, kecepatan);
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
