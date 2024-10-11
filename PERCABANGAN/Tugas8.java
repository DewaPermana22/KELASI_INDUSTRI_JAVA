package PERCABANGAN;
import java.util.*;

public class Tugas8 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Masukkan angka 1 : ");
        int angkaPertama = user.nextInt();
        System.out.print("Masukkan angka 2 : ");
        int angkaKedua = user.nextInt();
        System.out.println("================");
        System.out.println("Angka 1 : " + angkaPertama);
        System.out.println("Angka 2 : " + angkaKedua);
        System.out.println("================");
        user.close();

        if (angkaPertama % 2 == 0) {
            System.out.println("angka pertama bilangan genap");
            } else if (angkaPertama % 2 != 0) {
                System.out.println("angka pertama bilangan ganjil");
            }
        if (angkaKedua % 2 == 0) {
            System.out.println("angka kedua bilangan genap");
        } else if (angkaKedua % 2 != 0) {
            System.out.println("angka kedua bilangan ganjil");
        }
        }
    }
