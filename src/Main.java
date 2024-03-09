/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Mahasiswa[] mahasiswas = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Nilai: ");
            int nilai = scanner.nextInt();
            scanner.nextLine(); // consume newline

            mahasiswas[i] = new Mahasiswa(nim, nama, nilai);
        }

         System.out.println("---------------------------------------------------");

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int jumlahA = 0;
        int jumlahB = 0;
        int jumlahC = 0;
        int jumlahD = 0;
        int jumlahE = 0;
        int totalNilai = 0;
        String[] lulusNama = new String[jumlahMahasiswa];
        String[] tidakLulusNama = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            Mahasiswa mahasiswa = mahasiswas[i];
            System.out.println("NIM: " + mahasiswa.nim);
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("Nilai: " + mahasiswa.nilai);
            String grade = mahasiswa.hitungGrade();
            System.out.println("Grade: " + grade);
            System.out.println("---------------------------------------------------");

            totalNilai += mahasiswa.nilai;

            if (!grade.equals("Input nilai anda salah")) {
                if (grade.equals("A") || grade.equals("B") || grade.equals("C")) {
                    lulusNama[jumlahLulus] = mahasiswa.nama;
                    jumlahLulus++;
                } else {
                    tidakLulusNama[jumlahTidakLulus] = mahasiswa.nama;
                    jumlahTidakLulus++;
                }

                if (grade.equals("A")) {
                    jumlahA++;
                } else if (grade.equals("B")) {
                    jumlahB++;
                } else if (grade.equals("C")) {
                    jumlahC++;
                } else if (grade.equals("D")) {
                    jumlahD++;
                } else {
                    jumlahE++;
                }
            }
        }

        System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
        System.out.println("Jumlah Mahasiswa yg Lulus: " + jumlahLulus + " yaitu " + daftarNama(lulusNama, jumlahLulus));
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus: " + jumlahTidakLulus + " yaitu " + daftarNama(tidakLulusNama, jumlahTidakLulus));
        System.out.println("Jumlah Mahasiswa dengan Nilai A = " + jumlahA);
        System.out.println("Jumlah Mahasiswa dengan Nilai B = " + jumlahB);
        System.out.println("Jumlah Mahasiswa dengan Nilai C = " + jumlahC);
        System.out.println("Jumlah Mahasiswa dengan Nilai D = " + jumlahD);
        System.out.println("Jumlah Mahasiswa dengan Nilai E = " + jumlahE);

        double rataRataNilai = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rataRataNilai);
    }

    private static String daftarNama(String[] nama, int jumlah) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jumlah; i++) {
            sb.append(nama[i]);
            if (i != jumlah - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}