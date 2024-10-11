package Dewapermana_ujian;

import java.util.Scanner;

public class ujian_05 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah deret : ");
    int jumlahDeret = input.nextInt();
    System.out.print("Masukkan angka awal : ");
    int angka = input.nextInt();
    input.close();
     for (int i = 0; i < jumlahDeret; i++) {
        if (angka % 2 != 0) {
            System.out.println(angka); 
            angka += 2;
        }
   } 
}
}
