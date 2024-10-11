package operatorString;

import java.util.Scanner;

public class OS17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Depan : ");
        String namaDepan = input.nextLine();
        System.out.print("Masukkan Nama Belakang : ");
        String namaBelakang = input.nextLine();
        System.out.print("Masukkan Alamat anda : ");
        String alamat = input.nextLine();
        input.close();
        String namaLengkap = namaDepan + " " + namaBelakang;
        System.out.println("---------------------------------------------");
        StringBuilder output = new StringBuilder();
        System.out.print("Nama Lengkap : " + namaLengkap);
        System.out.print("\nAlamat " + namaLengkap + " adalah di " + alamat);
        for (int i = 0; i < namaLengkap.length(); i++) {
            char a = namaLengkap.charAt(i);
            if (i %2 == 0 ) {
                output.append(Character.toUpperCase(a));
            } else {
                output.append(Character.toLowerCase(a));
            }
        }
        System.out.println();
        System.out.println(output.toString());
        StringBuilder outputAlamat = new StringBuilder();
        for (int i = 0; i < alamat.length(); i++) {
            char b = alamat.charAt(i);
            if (i % 2 == 0) {
                outputAlamat.append(Character.toUpperCase(b));
            } else {
                outputAlamat.append(Character.toLowerCase(b));
            }
        }
        System.out.println(outputAlamat.toString());
    }
}
