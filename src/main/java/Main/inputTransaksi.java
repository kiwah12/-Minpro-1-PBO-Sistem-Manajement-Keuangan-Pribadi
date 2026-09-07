/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author MSI THIN 15
 */
public class inputTransaksi {
 private Scanner scanner;

    // Constructor
    public inputTransaksi(Scanner scanner) {
        this.scanner = scanner;
    }

    public int inputInt(String pesan) {
        System.out.print(pesan);
        while (!scanner.hasNextInt()) {
            System.out.print("Input harus berupa angka bulat, coba lagi: ");
            scanner.next();
        }
        int nilai = scanner.nextInt();
        scanner.nextLine();
        return nilai;
    }

    public double inputDouble(String pesan) {
        System.out.print(pesan);
        while (!scanner.hasNextDouble()) {
            System.out.print("Input harus berupa angka, coba lagi: ");
            scanner.next();
        }
        double nilai = scanner.nextDouble();
        scanner.nextLine();
        return nilai;
    }

    public String inputString(String pesan) {
        System.out.print(pesan);
        return scanner.nextLine();
    }
}