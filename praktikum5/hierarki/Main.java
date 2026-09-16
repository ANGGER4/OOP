/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.hierarki;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        // Objek mobil
        Mobil mobil = new Mobil();
        mobil.nama = "Civic Turbo";
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        System.out.println("--------------------");
        // Objek Sepeda Motor
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Aerox";
        motor.jumlahRoda = 2;
        motor.jenisMesin = "4-tak 155cc";
        motor.tampilkanInfo();
    }
}
