package Array;

import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Nilai : ");
        int panjang = user.nextInt();

        int angkaUser[] = new int[panjang];
        System.out.println("Masukkan nilai sebanyak " + panjang +": ");
        for (int i = 0; i < panjang; i++) {
            System.out.print("Nilai ke " + (i+1) + ": ");
            angkaUser[i] = user.nextInt();
        }
        System.out.println("Nilai yang anda masukkan adallah : ");
        for (int i = 0; i < panjang; i++) {
            System.out.print(angkaUser[i] + ", ");
        }
        user.close();
    }
}
