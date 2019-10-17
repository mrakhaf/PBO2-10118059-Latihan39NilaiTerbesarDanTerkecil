/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan39nilaiterbesardanterkecil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class NilaiMahasiswa {
    private final List<Integer> nilai = new ArrayList();
    private int banyakMhs, terbesar, terkecil;
    
    public void setNilai(int nilai) {
        this.nilai.add(nilai);
    }

    public int getBanyakMhs() {
        return banyakMhs;
    }

    public void setBanyakMhs(int banyakMhs) {
        this.banyakMhs = banyakMhs;
    }
    
    private void hitungNilaiTerbesar(int idx) {
        if(terbesar < nilai.get(idx))
            terbesar = nilai.get(idx);
    }
    
    private void hitungNilaiTerkecil(int idx) {
        if(terkecil > nilai.get(idx))
            terkecil = nilai.get(idx);
    }

    public void tampilNilai() {
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        
        terbesar = nilai.get(0);
        terkecil = nilai.get(0);
        
        for(int i = 0; i < nilai.size(); i++) {
            hitungNilaiTerbesar(i);
            hitungNilaiTerkecil(i);
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = "
                    + nilai.get(i));
        }
        
        // output hasil
        System.out.println("\nNilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);
    }
}
