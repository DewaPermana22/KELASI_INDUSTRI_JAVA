package Dewapermana_ujian;

import java.util.Scanner;

public class ujian_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();
        System.out.print("Masukkan nis anda : ");
        int nis = input.nextInt();
        System.out.print("Masukkan umur anda : ");
        int umur = input.nextInt();
        System.out.print("Masukkan alamat anda : ");
        String alamat = input.next();
        System.out.print("Masukkan asal sekolah anda : ");
        String sekolah = input.next();
        System.out.print("Masukkan nomor telfon anda : ");
        String noTelpon = input.next();
        System.out.print("Masukkan tingi badan anda ; ");
        double tb = input.nextDouble();
        System.out.print("Berat badan anda : ");
        double bb = input.nextDouble();
        input.close();
        System.out.println("--------------------------------------");
        System.out.println("Nama Lengkap : " + nama + "\nNIS : " + nis + "\nUmur : " + umur + "\nAlamat : " + alamat + "\nSekolah : " + sekolah + "\nNo Telp : " + noTelpon + "\nTinggi Badan : " + tb + "\nBerat Badan : " + bb);
    }
}
