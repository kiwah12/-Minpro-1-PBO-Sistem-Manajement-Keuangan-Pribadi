/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


/**
 *
 * @author MSI THIN 15
 */
import java.util.ArrayList;
public class Transaksimanager {
    private ArrayList<Transaksi> daftarTransaksi;
    private int idCounter;

    // Constructor
    public Transaksimanager() {
        this.daftarTransaksi = new ArrayList<>();
        this.idCounter = 1;
    }

    // CREATE
    public void tambahTransaksi(String tanggal, String jenis, String kategori, double jumlah) {
        Transaksi t = new Transaksi(idCounter, tanggal, jenis, kategori, jumlah);
        daftarTransaksi.add(t);
        idCounter++;
        System.out.println(">> Transaksi berhasil ditambahkan.");
    }

    // READ (menampilkan semua data - menggunakan perulangan)
    public void tampilkanSemuaTransaksi() {
        if (daftarTransaksi.isEmpty()) {
            System.out.println(">> Belum ada data transaksi.");
            return;
        }
        System.out.println("=====================================================================");
        System.out.printf("%-4s %-12s %-12s %-15s %s%n",
                "ID", "Tanggal", "Jenis", "Kategori", "Jumlah");
        System.out.println("=====================================================================");
        for (Transaksi t : daftarTransaksi) {
            System.out.println(t);
        }
        System.out.println("=====================================================================");
    }

    // Mencari transaksi berdasarkan ID
    public Transaksi cariTransaksi(int id) {
        for (Transaksi t : daftarTransaksi) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    // UPDATE
    public boolean updateTransaksi(int id, String tanggal, String jenis, String keterangan, double jumlah) {
        Transaksi t = cariTransaksi(id);
        if (t == null) {
            return false;
        }
        t.setTanggal(tanggal);
        t.setJenis(jenis);
        t.setJumlah(jumlah);
        return true;
    }

    // DELETE
    public boolean hapusTransaksi(int id) {
        for (int i = 0; i < daftarTransaksi.size(); i++) {
            if (daftarTransaksi.get(i).getId() == id) {
                daftarTransaksi.remove(i);
                return true;
            }
        }
        return false;
    }

    // Perhitungan ringkasan keuangan
    public double hitungTotalPemasukan() {
        double total = 0;
        for (Transaksi t : daftarTransaksi) {
            if (t.getJenis().equalsIgnoreCase("Pemasukan")) {
                total += t.getJumlah();
            }
        }
        return total;
    }

    public double hitungTotalPengeluaran() {
        double total = 0;
        for (Transaksi t : daftarTransaksi) {
            if (t.getJenis().equalsIgnoreCase("Pengeluaran")) {
                total += t.getJumlah();
            }
        }
        return total;
    }

    public double hitungSaldo() {
        return hitungTotalPemasukan() - hitungTotalPengeluaran();
    }

    public ArrayList<Transaksi> getDaftarTransaksi() {
        return daftarTransaksi;
    }
}