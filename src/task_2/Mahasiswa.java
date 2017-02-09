/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
    private String NIM, Nama, Status;
    private char[] nilai;
    private int i;
    
    public Mahasiswa() {
        this.Status ="tidak lulus";
        this.i = 0;
        this.nilai = new char[10];
    }
    
    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Status = "Tidak Lulus";
        this.i = 0;
        this.nilai = new char[10];
    }
    
    public String getNIM() {
        return NIM;
    }
    
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public String getStatus() {
        return Status;
    }
    
    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public char getNilai (int a) {
        char nil = this.nilai[a];
        return nil;
    }
    
    public void setNilai (char[] nilai) {
        this.nilai = nilai;
    }
    
    public int getA() {
        return i;
    }
    
    public void setA(int a) {
        this.i = a;
    }
    
    public void addNilai (char nilai) {
        if (i < 10) {
            this.nilai[i] = nilai;
            i++;
        }
    }
    
    public String toString() {
        String mhs = NIM + "," +Nama+ "," +Status+ "=";
        for (int m = 0; m < i; m++) {
            mhs = mhs+nilai[m]+ ",";
        }
        return mhs;
    }
    
    public char cekNilai (Mahasiswa m) {
        char i = 0;
        for(char j = 'A'; j < 'E'; j++) {
            for (int k = 0; k < i; k++) {
                if (nilai [k] == j) {
                    for (int n = 0; n < m.i; n++) {
                        if (m.nilai[n] == j) {
                            return j;
                        }
                    }
                }
            }
        }
        return i;
    }
}
