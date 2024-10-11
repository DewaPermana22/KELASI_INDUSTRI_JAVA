package operatorString;

import java.util.Scanner;

public class OS2 {
    public static void main(String[] args) {
        String kalimat;
        int gaji = 0;
        double bonus = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Kalimat : ");
        kalimat = input.nextLine();

        if (kalimat.length() > 1000) {
            gaji = 15000;
            bonus = gaji * 1.0;
        } else if (kalimat.length() > 100) {
            int kelipatan = (kalimat.length() - 100) / 100;
            gaji = 10000 + kelipatan * 10000;
        } else if (kalimat.length() >= 50) {
            gaji = 5000;
        } else {
            gaji = 2000;
        }

        if (kalimat.length() > 1000) {
            System.out.print("Gaji anda : " + gaji);
            System.out.print("\nBonus anda : " + bonus);
        } else {
            System.out.print("Gaji anda : " + gaji);
            System.out.print("\nBonus anda : 0");
        }

        input.close();
    }
}

