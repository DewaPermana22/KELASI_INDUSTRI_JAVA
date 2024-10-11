package PERCABANGAN;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        DecimalFormat harga = new DecimalFormat("#,###");
        DecimalFormat decimal = new DecimalFormat("#.##");
        
        System.out.print("Masukkan total belanjaan anda : ");
        double total = user.nextDouble();
        user.close();

        double kurang = 500000 - total;

        if (total >= 500000) {
            System.out.println("Selamat anda mendapatkan gantungan kunci!");
        }
        else {
            System.out.println("Maaf anda belum dapat bonus gantungan kunci");
            System.out.println("Silahkan tambah belanjaan anda sebesar " + harga.format(kurang) + " agar anda mendapat bonus dari kami");
        }

        System.out.println("Total belanjaan anda : " + "Rp." +  harga.format(total));
    }
}
