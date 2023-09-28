package com.Config;

import java.sql.*;

public class Connection {
    private static String JDBCDRIVER = "com.mysql.cj.jdbc.Driver";  //Loading class `com.mysql.jdbc.Driver'. This is deprecated
    private static String DBURL = "jdbc:mysql://localhost:3306/dbsepakbolabnsp";
    private static String USER = "root";
    private static String PASS = "";
    
    // ini untuk instansiasi object dari class DriverManager dan Connection
    private static java.sql.Connection connect; 
    private static Statement statement;
    private static ResultSet resultData;
    
    public static void connection(){
        // method untuk melakukan koneksi ke database
        try {
            // registrasi driver yang akan dipakai
            Class.forName(JDBCDRIVER); 
            
            // buat koneksi ke database
            connect = DriverManager.getConnection(DBURL, USER, PASS); 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String getKlasemenData(){
        Connection.connection();
        
        // isi nilai default dari variabel data
        String data = "Klasemen tidak ada";
        
        try {
            // buat object statement yang ambil dari koneksi
            statement = connect.createStatement();
            
            // query select all data from database
            String query = "SELECT nama_tim FROM `tblklasemen` ORDER BY poin_jmlh DESC, gol_jmlh DESC";
            
            // eksekusi query
            resultData = statement.executeQuery(query);
            System.out.println(statement.executeQuery(query));
            
            // set variabel data jadi null
            data = "";
            
            while (resultData.next()){
               data += resultData.getString("nama_tim")+"\n";
            }
            
            
            // close connection
            statement.close();
            connect.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return data;
    }
    
    public static boolean menambahkanTim(String namaTim){
        Connection.connection();
        boolean data = false;
        
        try {
            statement = connect.createStatement();
            
            String query = "INSERT INTO `tblklasemen`(`nama_tim`, `poin_jmlh`, `gol_jmlh`, `menang_jlmh`) VALUES ('"+ namaTim +"',0,0,0)";
            
            data = !statement.execute(query);
            
            //tutup
            statement.close();
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return data;
    }
    
    
    
    public static boolean menangPertandingan(String namaTim){
        Connection.connection();
        boolean data = false;
        
        try {
            statement = connect.createStatement();
            
            String query = "UPDATE `tblklasemen` SET `poin_jmlh` +=3 ,`gol_jmlh` += 2,`menang_jlmh` +=1 WHERE `nama_tim`='"+namaTim+"'";
            
            data = !statement.execute(query);
            
            //tutup
            statement.close();
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return data;
    }
    
    
    public static boolean seriPertandingan(String namaTim){
        Connection.connection();
        boolean data = false;
        
        try {
            statement = connect.createStatement();
            
            String query = "INSERT INTO `tblklasemen`(`nama_tim`, `poin_jmlh`, `gol_jmlh`, `menang_jlmh`) VALUES ('"+ namaTim +"',0,0,0)";
            
            data = !statement.execute(query);
            
            //tutup
            statement.close();
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return data;
    }
    
}

