/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListFakultasJurusan;

/**
 *
 * @author RAFIKA
 */
public class ListFakultas implements DataList {

    ElemenFakultas first;

    public ListFakultas() {
        first = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(ElemenFakultas e) {
        e.next = first;
        first = e;
        System.out.println("");
        System.out.println("- Data Fakultas berhasil ditambahkan -");
    }

    @Override
    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("kosong");
        } else {
            first = first.next;
        }
    }

    @Override
    public void deleteElemen(String kode) {
        if (first == null) {
            System.out.println("Data Fakultas Masih Kosong");
        } else if (first.kode.equalsIgnoreCase(kode)) {
            deleteFirst();
            System.out.println("");
            System.out.println("- Data Fakultas berhasil dihapus -");
        } else {
            ElemenFakultas helper = first;
            while (helper.next != null && !helper.next.kode.equalsIgnoreCase(kode)) {
                helper = helper.next;
            }

            if (helper.next != null) {
                helper.next = helper.next.next;
                System.out.println("");
                System.out.println("- Data Fakultas berhasil dihapus -");
            } else {
                System.out.println("Fakultas tidak ditemukan");
            }
        }
    }

    @Override
    public void print() {
        if (first == null) {
            System.out.println("Data Fakultas masih Kosong");
        } else {
            ElemenFakultas helper = first;
            int i = 0;
            while (helper != null) {
                System.out.println("Fakultas No-"+(i+1));
                System.out.println("Kode Fakultas : " + helper.kode);
                System.out.println("Nama Fakultas : " + helper.nama);
                System.out.println("Nama Dekan    : " + helper.getNamaPimpinan());
                helper.jurusan.print();
                helper = helper.next;
                i++;
            }
        }
    }


    public ElemenFakultas SearchData(String kode) {

        ElemenFakultas helper = first;
        if (first != null) {
            while (helper.next != null && !helper.kode.equalsIgnoreCase(kode)) {
                helper = helper.next;
            }

            if (helper.kode.equalsIgnoreCase(kode)) {
                return helper;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public ElemenJurusan searchJurusan(String kode) {
        ElemenFakultas helper = first;
        ElemenJurusan hasil = null;

        while (helper != null && hasil == null) {
            hasil = helper.jurusan.SearchData(kode);
            helper = helper.next;
        }

        return hasil;
    }
}
