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
public class ListJurusan implements DataList{

    ElemenJurusan first;

    public ListJurusan() {
        first = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(ElemenJurusan e) {
        e.next = first;
        first = e;
        System.out.println("");
        System.out.println("- Data Jurusan berhasil ditambahkan -");
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
            System.out.println("Data Jurusan Masih Kosong");
        } else if (first.kode.equals(kode)) {
            deleteFirst();
            System.out.println("");
            System.out.println("- Data Jurusan berhasil dihapus -");
        } else {
            ElemenJurusan helper = first;
            while (helper.next != null && !helper.next.kode.equals(kode)) {
                helper = helper.next;
            }

            if (helper.next != null) {
                helper.next = helper.next.next;
                System.out.println("");
                System.out.println("- Data Jurusan berhasil dihapus -");
            } else {
                System.out.println("Fakultas dan Jurusan tidak ditemukan");
            }
        }
    }

    @Override
    public void print() {
        if (first == null) {
            System.out.println("Data Jurusan Masih Kosong");
        } else {
            ElemenJurusan helper = first;
            int i = 0;
            System.out.println("Dengan berisi Jurusan : ");
            while (helper != null) {
                System.out.println("    Jurusan No-"+(i+1));
                System.out.println("    Kode Jurusan : " + helper.kode);
                System.out.println("    Nama Jurusan : " + helper.nama);
                System.out.println("    Nama Kajur   : " + helper.getNamaPimpinan());
                helper = helper.next;
                i++;
            }
        }
    }

    public ElemenJurusan SearchData(String kode) {

        ElemenJurusan helper = first;

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
}
