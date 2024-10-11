package OperatorPemograman;
import java.util.Scanner;

public class OP15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil;

        System.out.println("Masukkan nilai a : ");
        int a = input.nextInt();
        System.out.println("Masukkan nilai b : ");
        int b = input.nextInt();

        hasil = a & b;
        System.out.println("hasil a&b : " + hasil);
        hasil = a | b;
        System.out.println("hasil a|b : " + hasil);
        hasil = a ^ b;
        System.out.println("hasil a^b : " + hasil);
        hasil = ~a;
        System.out.println("hasil dari ~a : " + hasil);
        hasil= a << 2;
        System.out.println("haasil dari a << 2 : " + hasil);
        hasil = b >> 2;
        System.out.println("hasil dari b>>2 : " + hasil);
        input.close();

    }
}
