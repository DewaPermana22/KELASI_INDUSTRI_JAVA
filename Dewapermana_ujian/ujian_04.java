package Dewapermana_ujian;

import java.util.Scanner;

public class ujian_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah belanjaan anda : ");
        int totalBelanja = input.nextInt();
        double diskon = totalBelanja * 10 / 100;
        double diskon20 = totalBelanja * 20 / 100;
        
        if (totalBelanja >= 500000 && totalBelanja <= 1000000) {
            System.out.println("Anda mendapat diskon 10%");
            System.out.println("Total beanjaan anda : " +  (totalBelanja - diskon));
        } else if (totalBelanja > 1000000) {
            System.out.println("Anda dapat diskon 20%");
            System.out.println("Yang harus dibayar : " + (totalBelanja - diskon20));
        } else {
            System.out.println("Anda tidak dapat diskon silahkan tambah " + (500000 - totalBelanja));
        }
        input.close();
    }
}
