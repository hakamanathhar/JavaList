/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListFakultasJurusan;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListFakultas fakultas = new ListFakultas();
        String nama, kode, cari;
        String namaKajur, namaDekan;
        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("");
            System.out.println("============== MENU ============");
            System.out.println("================================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            System.out.println("------------------------");
            System.out.print("Masukkan Pilihan : ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println("");

            if (pilihan == 1) {
                System.out.println("==== Tambah Data ====");
                System.out.println("1. Tambah Fakultas");
                System.out.println("2. Tambah Jurusan");
                System.out.print("Masukkan pilihan : ");
                pilihan = sc.nextInt();
                if (pilihan == 1) {
                    System.out.print("Masukkan kode fakultas : ");
                    kode = sc.next();
                    sc.nextLine();
                    System.out.print("Masukkan nama fakultas : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan nama Dekan    : ");
                    namaDekan = sc.nextLine();
                    fakultas.insertFirst(new ElemenFakultas(kode, nama, namaDekan));
                } else if (pilihan == 2) {
                    System.out.print("Masukkan kode Fakultas : ");
                    cari = sc.next();
                    ElemenFakultas fk = fakultas.SearchData(cari);
                    if (fk != null) {
                        System.out.print("Masukkan kode Jurusan : ");
                        kode = sc.next();
                        sc.nextLine();
                        System.out.print("Masukkan nama Jurusan : ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan nama Kajur   : ");
                        namaKajur = sc.nextLine();
                        fk.jurusan.insertFirst(new ElemenJurusan(kode, nama, namaKajur));
                    } else {
                        System.out.println("Kode Fakultas tidak ditemukan");
                    }
                } else {
                    System.out.println("Pilihan Salah");
                }
            } else if (pilihan == 2) {
                System.out.println("==== Hapus Data ====");
                System.out.println("1. Hapus Fakultas");
                System.out.println("2. Hapus Jurusan");
                System.out.print("Masukkan pilihan : ");
                pilihan = sc.nextInt();
                if (pilihan == 1) {
                    System.out.print("Masukkan kode fakultas : ");
                    kode = sc.next();
                    fakultas.deleteElemen(kode);
                } else if (pilihan == 2) {
                    System.out.print("Masukkan kode fakultas : ");
                    cari = sc.next();
                    ElemenFakultas fk = fakultas.SearchData(cari);
                    if (fk != null) {
                        System.out.print("Masukkan kode jurusan : ");
                        kode = sc.next();
                        fk.jurusan.deleteElemen(kode);
                    } else {
                        System.out.println("Fakultas tidak ditemukan");
                    }
                }
            } else if (pilihan == 3) {
                System.out.println("==== Cari Data ====");
                System.out.println("1. Cari Fakultas");
                System.out.println("2. Cari Jurusan");
                System.out.print("Masukkan pilihan : ");
                pilihan = sc.nextInt();
                if (pilihan == 1) {
                    System.out.print("Masukkan kode fakultas : ");
                    kode = sc.next();
                    fakultas.SearchData(kode);
                    ElemenFakultas fk = fakultas.SearchData(kode);
                    if (fk != null) {
                        System.out.println("Kode Fakultas : " + fk.kode);
                        System.out.println("Nama Fakultas : " + fk.nama);
                        System.out.println("Nama Dekan    : " + fk.getNamaPimpinan());
                        fk.jurusan.print();
                    } else {
                        System.out.println("Fakultas tidak ditemukan");
                    }
                } else if (pilihan == 2) {
                    System.out.print("Masukkan kode jurusan : ");
                    kode = sc.next();
                    ElemenJurusan jr = fakultas.searchJurusan(kode);
                    if (jr != null) {
                        System.out.println("Kode Jurusan : " + jr.kode);
                        System.out.println("Nama Jurusan : " + jr.nama);
                        System.out.println("Nama Kajur   : " + jr.getNamaPimpinan());
                    } else {
                        System.out.println("Jurusan tidak ditemukan");
                    }
                }
            } else if (pilihan == 4) {
                fakultas.print();
            } else if (pilihan == 5) {
                break;
            }
        }
    }
}
