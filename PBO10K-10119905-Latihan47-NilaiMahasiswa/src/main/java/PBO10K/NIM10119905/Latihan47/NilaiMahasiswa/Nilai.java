/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan47.NilaiMahasiswa;

/**
 *
 * @author aruma
 */
public class Nilai {
    private double nilaiQuiz;
    private double nilaiUTS;
    private double nilaiUAS;
    
    public double getNilaiQuiz(){
        return nilaiQuiz;
    }
    
    public void setNilaiQuiz(double nilaiQuiz){
        this.nilaiQuiz=nilaiQuiz;
    }
    
    public double getNilaiUTS(){
        return nilaiUTS;
    }
    
    public void setNilaiUTS(double nilaiUTS){
        this.nilaiUTS=nilaiUTS;
    }
    
    public double getNilaiUAS(){
        return nilaiUAS;
    }
    
    public void setNilaiUAS(double nilaiUAS){
        this.nilaiUAS=nilaiUAS;
    }
    
    public double nilaiAkhir(){
        return (0.2*nilaiQuiz)+(0.3*nilaiUTS)+(0.5*nilaiUAS);
    }
    public String statusNilai(double nilai){
        if (nilai >80 && nilai<=100){
            System.out.println("Index = A");
            System.out.println("Keterangan = Sangat Baik");
        } else if (nilai >68 && nilai<=80){
            System.out.println("Index = B");
            System.out.println("Keterangan = Baik");
        } else if (nilai >56 && nilai<=68){
            System.out.println("Index = C");
            System.out.println("Keterangan = Cukup");
        } else if (nilai >45 && nilai<=56){
            System.out.println("Index = D");
            System.out.println("Keterangan = Kurang");
        } else if (nilai >0 && nilai<=45){
            System.out.println("Index = E");
            System.out.println("Keterangan = Sangat Kurang");
        }
        return null;
    }
}
