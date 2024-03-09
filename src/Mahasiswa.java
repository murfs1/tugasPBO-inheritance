/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    String nim;
    String nama;
    int nilai;

    Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    String hitungGrade() {
        if (nilai >= 80 && nilai <= 100) {
            return "A";
        } else if (nilai >= 70 && nilai <= 79) {
            return "B";
        } else if (nilai >= 60 && nilai <= 69) {
            return "C";
        } else if (nilai >= 50 && nilai <= 59) {
            return "D";
        } else if (nilai >= 0 && nilai < 50) {
            return "E";
        } else {
            return "Input nilai anda salah";
        }
    }
}


