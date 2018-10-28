/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListFakultasJurusan;

/**
 *
 * @author PC
 */
public abstract class Data {
    protected String kode, nama;
    
    public Data(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }
    
    public abstract String getNamaPimpinan();
}
