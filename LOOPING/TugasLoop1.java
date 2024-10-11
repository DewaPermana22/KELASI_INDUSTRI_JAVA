package LOOPING;
import java.util.*;
public class TugasLoop1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Masukkan angka awal : ");
        int awal = user.nextInt();
        user.close();
        int hitung = 0;
        System.out.println("10 Bilangan yang habis dibagi 3 dari angka " + awal + " adalah : ");

        for (int i = awal; hitung < 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                hitung++;
            }
        }
    }
}
