package PERCABANGAN;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        DecimalFormat harga = new DecimalFormat("#,###");
        DecimalFormat decimal = new DecimalFormat("#.##");

        System.out.print("Masukkan total belanjaan anda : ");
        double total = user.nextDouble();
        user.close();

        if (total >= 500000) {
            System.out.println("Selamat anda mendapatkan gantungan kunci!");
        }
        else {
            System.out.println("Maaf anda cuma dapat hikmahnya");
        }

        System.out.println("Total belanjaan anda : " + "Rp." +  harga.format(total));
    }
}
