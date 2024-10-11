package Array;

import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Data : ");
        int panjang = input.nextInt();

        int panjangArray[] = new int[panjang];
        System.out.println("\nSilahkan menginputkan sebanyak " + panjang + " angka :" );

        for (int i = 0; i < panjang; i++) {
            System.out.print("Masukkan Angka ke " + (i+1) + ": ");
            panjangArray[i] = input.nextInt();
        }
        int angkaTerbesar = panjangArray[0];
        for (int i = 0; i < panjangArray.length; i++) {
            if (panjangArray[i] > angkaTerbesar) {
                angkaTerbesar = panjangArray[i];
            }
        }
        System.out.println("Angka Terbesar adalah : " + angkaTerbesar);
        input.close();
    }
}
