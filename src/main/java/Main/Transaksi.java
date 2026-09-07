/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author MSI THIN 15
 */
public class Transaksi {
    int id;
    String tanggal;
    String keterangan;
    double jumlah;

// Constructor
public Transaksi(int id,String tanggal, String keterangan, double jumlah){
    this.id = id;
    this.tanggal = tanggal;
    this.keterangan = keterangan;
    this.jumlah = jumlah;
}
}