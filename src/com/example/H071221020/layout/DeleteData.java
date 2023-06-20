package com.example.H071221020.layout;

import com.example.H071221020.controllers.DbController;

import java.util.Scanner;

public class DeleteData {
    public static void showDeleteData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Silahkan Pilih Data yang Ingin Dihapus");
        System.out.println("--------------------------------");
        DbController.getDatabase();
        System.out.println("--------------------------------");
        System.out.print("Masukkan Nama Produk: ");
        String nama = sc.nextLine();
        System.out.println("================================");

        if (DbController.deleteData(nama)) {
            System.out.println("Berhasil Delete Data");
        } else {
            System.out.println("Maaf, Gagal Delete Data");
        }

        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}
