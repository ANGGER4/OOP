/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Objek Mobil
        Mobil mobil = new Mobil("Toyota", 180, 4);
        mobil.tampilkanInfo();

        System.out.println("--------------------");

        // Objek Sepeda Motor
        SepedaMotor motor = new SepedaMotor("Yamaha", 120);
        motor.tampilkanInfo();
    }
}
