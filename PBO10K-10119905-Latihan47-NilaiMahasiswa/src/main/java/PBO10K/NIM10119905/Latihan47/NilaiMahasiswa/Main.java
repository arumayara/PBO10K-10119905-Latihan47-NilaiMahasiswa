/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan47.NilaiMahasiswa;

/**
 *
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Nilai Mahasiswa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai objNilai = new Nilai();
        objNilai.setNilaiQuiz(75);
        objNilai.setNilaiUTS(45);
        objNilai.setNilaiUAS(34);
        System.out.println("Quiz : "+objNilai.getNilaiQuiz());
        System.out.println("UTS : "+objNilai.getNilaiUTS());
        System.out.println("UAS : "+objNilai.getNilaiUAS());
        System.out.println("");
        System.out.println("Nilai Akhir : "+objNilai.nilaiAkhir());
        objNilai.statusNilai(objNilai.nilaiAkhir());
        
        
    }
    
}
