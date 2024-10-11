package PERCABANGAN;
import java.util.*;

public class Tugas9 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Mohon masukkan pilihan untuk menjalankan program!");
        System.out.println("Pilihan 1 : Untuk menjalankan program perbandingan angka terbesar dari angka 1 dan angka 2");
        System.out.println("Pilihan 2 : Untuk menjalankan program menentukan angka ganjil/genap dari angka 1 dan angka 2");
        System.out.println("Silahkan masukkan pilihan program : ");
        int pilihan = user.nextInt();
        System.out.println("Program yang anda pilih : " + pilihan);
        

        switch (pilihan) {
            case 1:
            System.out.print("Masukkan angka 1 : ");
            int angkaPertama = user.nextInt();
            System.out.print("Masukkan angka 2 : ");
            int angkaKedua = user.nextInt();
            System.out.println("================");
            System.out.println("Angka 1 : " + angkaPertama);
            System.out.println("Angka 2 : " + angkaKedua);
            System.out.println("================");
            
            if (angkaPertama > angkaKedua) {
                System.out.println("angka 1 lebih besar dari angka 2"); 
            } else if (angkaPertama < angkaKedua) {
                System.out.println("angka 2 lebih besar dari angka 1");
            }
            break;
            case 2:
            System.out.print("Masukkan angka 1 : ");
            int angka1 = user.nextInt();
            System.out.print("Masukkan angka 2 : ");
            int angka2 = user.nextInt();
            System.out.println("================");
            System.out.println("Angka 1 : " + angka1);
            System.out.println("Angka 2 : " + angka2);
            System.out.println("================");
            
            if (angka1 % 2 == 0) {
                System.out.println("angka pertama bilangan genap");
                } else if (angka1 % 2 != 0) {
                    System.out.println("angka pertama bilangan ganjil");
                }
            if (angka2 % 2 == 0) {
                System.out.println("angka kedua bilangan genap");
            } else if (angka2 % 2 != 0) {
                System.out.println("angka kedua bilangan ganjil");
            }
            break;
            default:
            System.out.println("inputan anda salah");
                break;
        } user.close();
    }
}
