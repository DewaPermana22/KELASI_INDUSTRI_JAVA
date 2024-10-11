package PERCABANGAN;
import java.util.*;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka untuk mengecek hari : ");
        int angkaHari = input.nextInt();
        input.close();

        switch (angkaHari) {
            case 1:
                System.out.println("Hari senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jum'at");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
            default:
                System.out.println("Inputan anda salah");
                break;
        }
    }
}