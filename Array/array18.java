package Array;
import java.util.*;

public class array18 {
    public static void main(String[] args) {
        ArrayList <Integer> angkaInputan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah angka inputan : ");
        int user = input.nextInt();
        for (int i = 0; i < user; i++) {
            System.out.print("masukkan angka ke " + (i+1) + " : ");
            int angkaUser = input.nextInt();
            angkaInputan.add(angkaUser);
        }
        System.out.println("--------------------------------");
        for (int i = 0; i < angkaInputan.size(); i++) {
            System.out.println("angka ke " + (i+1) + " yang di inputkan : " + angkaInputan.get(i));
        }
        int jumlah = 0;
        for (int i = 0; i < angkaInputan.size(); i++) {
            jumlah += angkaInputan.get(i);
        }
        System.out.println("--------------------------------");
        System.out.print("Hasil penjumlahan angka yang anda inputkan : " + jumlah);
        double rataRata = 0;
        rataRata = jumlah / user;
        System.out.print("\nRata rata : " + rataRata);
        input.close();
    }
}
