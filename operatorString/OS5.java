package operatorString;

import java.util.Scanner;

public class OS5 {
    public static void main(String[] args) {
        String kalimat[] = new String[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < kalimat.length; i++) {
            System.out.print("Masukkan Kalimat ke " + (i+1) + " : ");
            kalimat[i] = input.nextLine();
        }
        System.out.println("=====Kalimat Yang Belum Di Rapikan=====");
        for (int i = 0; i < kalimat.length; i++) {
            System.out.println(kalimat[i]);
        }
        System.out.println("=====Kalimat Yang Sudah Di Rapikan=====");
        for (int i = 0; i < kalimat.length; i++) {
            if (kalimat[i].isEmpty()) {
                System.out.println("-");
            } else {
                System.out.println(kalimat[i].trim());
            }
        }
        input.close();
    }
}
