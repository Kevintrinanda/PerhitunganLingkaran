/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10117008latihan22;

/**
 *
 * @author ASUS
 *  Nama         : Kevin Trinanda
 * Kelas        : IF-1 V
 * NIM          : 10117008
 * Deskripsi    : Program ini akan membantu kita menghitung diameter lingkaran
 */
import java.util.Scanner;
public class PBO10117008Latihan22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float luas = 0, diameter, jari, keliling; 

        Scanner input = new Scanner(System.in);
        System.out.println("=======Penghitungan Lingkaran=======");
        System.out.print("Masukkan Nilai Diameter Lingkaran : ");
        diameter = input.nextInt(); 
        

        jari = diameter / 2; 
        luas = (22 * jari * jari) / 7;
        keliling = (22/7) * diameter;
        
        System.out.println("====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + jari);
        System.out.println("Luas lingkaran      = " + luas); 
        System.out.println("Keliling Lingkaran  = " + keliling);
    }
    
}
