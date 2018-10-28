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
public class ElemenFakultas extends Data{
    private String namaDekan;
    ListJurusan jurusan = new ListJurusan();
    ElemenFakultas next;
       
       public ElemenFakultas(String kode, String nama, String namaDekan){
           super(kode, nama);
           this.namaDekan = namaDekan;
           next = null;
       }

    @Override
    public String getNamaPimpinan() {
        return namaDekan;
    }
}
