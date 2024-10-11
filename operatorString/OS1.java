package operatorString;

import java.util.Scanner;

public class OS1 {
    public static void main(String[] args) {
        String kalimat;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        kalimat = input.nextLine();
        System.out.println("Kalimat yang anda masukkan : " + kalimat);
        System.out.print("Jumlah Karakter : " + kalimat.length());
        System.out.println();

        if (kalimat.length() <= 10) {
            System.out.println("LOW");
        } else if (kalimat.length() < 50 && kalimat.length() >= 10) {
            System.out.println("MEDIUM");
        } else if (kalimat.length() >= 50) {
            System.out.println("HIGH");
        }
        input.close();
    }
}