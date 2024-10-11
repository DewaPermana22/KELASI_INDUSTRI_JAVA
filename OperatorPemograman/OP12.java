package OperatorPemograman;
import java.util.Scanner;

public class OP12 {
    public static void main(String[] args) {
        Scanner pegawai = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda : ");
        String nama = pegawai.nextLine();
        System.out.print("Masukan Tinggi Badan Anda : ");
        int Tinggi = pegawai.nextInt();
        System.out.print("Masukkan Nilai UN Anda : ");
        double UN = pegawai.nextDouble();
        pegawai.close();

        boolean lulus1 = (Tinggi >= 160);
        boolean lulus2 = (UN >= 80.0);
        
        System.out.println("========================");

        boolean seleksi = lulus1 && lulus2;
        System.out.println("Nama Pelamar : " + nama + "\n" + "Tinggi Badan : " + Tinggi + "cm" + "\n" + "Nilai Ujian : "
        + UN + "\n" + "Hasil Seleksi Pelamar : " + seleksi);
    }
}
