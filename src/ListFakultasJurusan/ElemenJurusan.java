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
public class ElemenJurusan extends Data{
    private String namaKajur;
    ElemenJurusan next;
       
       public ElemenJurusan(String kode, String nama, String namaKajur){
           super(kode, nama);
           this.namaKajur = namaKajur;
           next = null;
       }

    @Override
    public String getNamaPimpinan() {
        return namaKajur;
    }    
}
