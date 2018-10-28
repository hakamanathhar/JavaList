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
public interface DataList {   
    public boolean isEmpty();
    public void deleteFirst();
    public void deleteElemen(String kode);
    public void print();
}
