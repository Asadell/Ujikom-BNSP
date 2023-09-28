/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.View;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class view {
    private static Scanner inputUser = new Scanner(System.in);
    
    public static void home(){
        menu:
        while (true) {            
            System.out.print(
            "\n========================" 
            +"\nKLASEMEN SEPAK BOLA BNSP"
            +"\n========================"
            +"\nPilih menu dibawah"
            +"\n1. Menambah pertandingan"
            +"\n2. Daftar klasemen saat ini"
            +"\n0. keluar");
            String pilihan = inputUser.next();
            
            switch (pilihan){
                case "1":
//                    View
                    break;
                case "2":
//                    cView.detailData();
                    break;
//                case "3":
//                    cView.cariData();
//                    break;
//                case "4":
//                    cView.tambahData();
//                    break;
                case "0":
                    System.out.println("\nTERIMAKASIH!!");
                    break menu;
                default:
                    System.err.println("\npilihan anda salah");
                    System.err.flush();
            }
            
            
            
            
            
            
//            +"\n\nSilahkan masukkan tim yang bertanging"
//            +"\nTim pertama:");
//            String tim1 = inputUser.next();
//            
//            System.out.print("\nTim kedua: ");
//            String tim2 = inputUser.next();
            
            
            
            
            
            
            
            
        }
    }
    
    
    
    // method untuk melihat data
    public static void getKlasemenData(){
        System.out.println("\n::: DATA KLASEMEN :::");
        System.out.println("BELUMMMMMMMM");
        
//         call database, call dulu method yang memanggil database nya
//        System.out.println(Connection.getKlasemenData());
    }
}
