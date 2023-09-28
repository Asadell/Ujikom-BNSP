/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.View;

import com.Config.Connection;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class View {
    private static Scanner inputUser = new Scanner(System.in);
    
    public static void home(){
        menu:
        while (true) {            
            System.out.print(
            "\n========================" 
            +"\nKLASEMEN SEPAK BOLA BNSP"
            +"\n========================"
            +"\nPilih menu dibawah" 
            +"\n1. Menambah Tim"
            +"\n2. Menambah pertandingan"
            +"\n2. Daftar klasemen saat ini" 
//            +"\n3. Lihat tim"
//            +"\n5. Melihat detail dari tim"
            +"\n0. keluar"
            +"\npilih menu : ");
            String pilihan = inputUser.next();
            
            switch (pilihan){
                case "1":
                    System.out.print("\nNama Tim : ");
                    String namaTim = inputUser.next();
                    View.menambahkanTim(namaTim);
                    break;
                case "2":
                    View.setTambahPertandingan();
                    break;
                case "3":
                    View.getKlasemenData();
                    break;
                case "4":
//                    View.
                    break;
                case "5":
//                    View.
                    break;
                case "0":
                    System.out.println("\nTERIMAKASIH!!");
                    break menu;
                default:
                    System.err.println("\npilihan anda salah");
                    System.err.flush();
            }
        }
    }
    
    // menambah tim ke dalam database, + membuat objek
    public static void menambahkanTim(String namaTim){
        if(Connection.menambahkanTim(namaTim)){
            System.out.println("\nBerhasil menambahkan Tim\n");
        }else{
            System.err.println("\npilihan anda salah");
            System.err.flush();
        }
    }
    
    
    
    // method untuk melihat data
    public static void getKlasemenData(){
        System.out.println("\n::: DATA KLASEMEN :::");
        
        // memanggil return function untuk mendapatkan urutan tim
        System.out.println(Connection.getKlasemenData());
    }
    
    // method untuk melihat data
    public static void setTambahPertandingan(){
        System.out.print("Tim1: ");
        String tim1 = inputUser.next();
        System.out.print("Tim2: ");
        String tim2 = inputUser.next();
        
        menu:
        while (true) {            
            System.out.print("Status Pertandingan:" 
            + "1. Menang"
            + "2. Seri");
            String pilihan = inputUser.next();
            
            switch (pilihan){
                case "1":
                    View.menangPertandingan(tim1);
                    break;
                case "2":
                    View.getKlasemenData();
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
        }
        System.out.print("Tim: ");
        System.out.print("Tim: ");
        System.out.print("");
        
//         call database, call dulu method yang memanggil database nya
//        System.out.println(Connection.getKlasemenData());
    }
    
    // method untuk melihat ddetail dari tim
//    public static void getDetailTim(){
//        
//    }
    
    public static void menangPertandingan(String tim1){
        Connection.menangPertandingan(tim1);
    }
    
    public static void seriPertandingan(){
        
    }
    
}
