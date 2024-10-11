package PERCABANGAN;
import java.util.*;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        int harga = 0;
        System.out.print("Massukkan merk barang : ");
        String merk = user.nextLine();
        System.out.print("Masukkan ukuran barang : ");
        int ukuran = user.nextInt();
        user.close();

        if (merk.equals("ABC")) {
            if (ukuran >= 26 && ukuran <= 30) {
                harga = 160000;
            } else if (ukuran >= 31 && ukuran <= 34) {
                harga = 180000;
            }
        }
        else if (merk.equals("DEF")) {
            if (ukuran >= 26 && ukuran <= 30) {
                harga = 210000;
            } else if (ukuran >= 31 && ukuran <= 34) {
                harga = 220000;
            }
        }
        System.out.println("Merk yang anda inputkan : " + merk);
        System.out.println("Ukuran yang anda inputkan : " + ukuran);
        System.out.println("Harga barang anda : " + harga);
    }
}
