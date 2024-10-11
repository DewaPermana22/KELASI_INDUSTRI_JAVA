package Array;

import java.util.Scanner;

public class array11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data Nama : ");
        int Jumlah = input.nextInt();

        System.out.print("Masukkan Jumlah Nilai pengguna : ");
        int jumlahNilai = input.nextInt();
        
        String panjangUser[][] = new String[Jumlah][1];
        int dataNilai[][] = new int[Jumlah][jumlahNilai];

        System.out.println("Masukkan Data sebanyak : " + Jumlah);
        for (int i = 0; i < Jumlah; i++) {
            System.out.print("masukkan nama ke " + (i+1) + " : ");
            panjangUser[i][0] = input.next();

         for (int j = 0; j < jumlahNilai; j++) {
            System.out.print("Masukkan Nilai " + panjangUser[i][0] + " ke " + (j+1) + " : ");
            dataNilai[i][j] = input.nextInt(); 
             }
         }
        int nilaiMasingmasing;
        System.out.println("Data yang disimpan : ");
        for (int i = 0; i < Jumlah; i++) {
            nilaiMasingmasing = 0;
            System.out.print("\nNama pengguna : " + panjangUser[i][0] + "\n");
            for (int j = 0; j < jumlahNilai; j++) {
                System.out.println("Nilai ke " + (j+1) + " : " + dataNilai[i][j]);
                nilaiMasingmasing += dataNilai[i][j];
            }
            double rataRata = (double) nilaiMasingmasing / jumlahNilai;
            if (rataRata >= 80 && rataRata <= 101) {
                System.out.println("Predikat Nilai : A");
            }else if (rataRata >=70 && rataRata <= 81) {
                System.out.println("Predikat Nilai : B ");
            }else if (rataRata >= 50 && rataRata <= 71) {
                System.out.println("Predikat Nilai : C");
            }else if (rataRata >= 30 && rataRata <= 51) {
                System.out.println("Predikat Nilai : D ");
            }else if (rataRata >= -1 && rataRata <= 31) {
                System.out.println("Predikat Nilai : E ");
            }
            System.out.print("Rata rata nilai  " + panjangUser[i][0] + " : " + rataRata);
        }
            input.close();
}
    }



