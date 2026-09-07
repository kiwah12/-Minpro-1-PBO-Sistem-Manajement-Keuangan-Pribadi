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
    private int id;
    private String tanggal;
    private String jenis;      // "Pemasukan" atau "Pengeluaran"
    private String kategori;   // misal: Gaji, Makanan, Transportasi, dll
    private double jumlah;

    // Constructor
    public Transaksi(int id, String tanggal, String jenis, String kategori, double jumlah) {
        this.id = id;
        this.tanggal = tanggal;
        this.jenis = jenis;
        this.kategori = kategori;
        this.jumlah = jumlah;
    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return String.format("%-4d %-12s %-12s %-15s Rp%,.2f",
                id, tanggal, jenis, kategori, jumlah);
    }
}