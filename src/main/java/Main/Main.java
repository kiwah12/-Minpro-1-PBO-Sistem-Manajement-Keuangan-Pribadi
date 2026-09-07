/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;
import java.util.Scanner;
/**
 *
 * @author MSI THIN 15
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Transaksimanager manager = new Transaksimanager();
    private static inputTransaksi input = new inputTransaksi(scanner);

    public static void main(String[] args) {
        boolean berjalan = true;

        System.out.println("=====================================================");
        System.out.println("   SISTEM MANAJEMEN KEUANGAN PRIBADI");
        System.out.println("=====================================================");
        
        while (berjalan) {
            tampilkanMenu();
            int pilihan = input.inputInt("Pilih menu (1-6): ");

            // Percabangan untuk memilih menu
            switch(pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    manager.tampilkanSemuaTransaksi();
                    break;
                case 3:
                    tampilkanRingkasan();
                    break;
                case 0:
                    berjalan = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi ini. Sampai jumpa!");
                    break;
                default:
                    System.out.println(">> Pilihan tidak valid, silakan coba lagi.");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("-----------------------------------------------------");
        System.out.println("MENU:");
        System.out.println("1. Tambah Transaksi");
        System.out.println("2. Lihat Semua Transaksi");
        System.out.println("3. Lihat Ringkasan Keuangan");
        System.out.println("0. Keluar");
        System.out.println("-----------------------------------------------------");
    }

    private static void tambahData() {
        System.out.println("--- Tambah Transaksi Baru ---");
        String tanggal = input.inputString("Tanggal (dd-mm-yyyy): ");
        String jenis = input.inputString("Jenis (Pemasukan/Pengeluaran): ");
        String kategori = input.inputString("Kategori (misal: Gaji, Makanan, Transportasi): ");
        double jumlah = input.inputDouble("Jumlah (Rp): ");

        manager.tambahTransaksi(tanggal, jenis, kategori, jumlah);
    }
    private static void tampilkanRingkasan() {
        double pemasukan = manager.hitungTotalPemasukan();
        double pengeluaran = manager.hitungTotalPengeluaran();
        double saldo = manager.hitungSaldo();

        System.out.println("--- Ringkasan Keuangan ---");
        System.out.printf("Total Pemasukan   : Rp%,.2f%n", pemasukan);
        System.out.printf("Total Pengeluaran : Rp%,.2f%n", pengeluaran);
        System.out.printf("Saldo Akhir       : Rp%,.2f%n", saldo);
    }
}
