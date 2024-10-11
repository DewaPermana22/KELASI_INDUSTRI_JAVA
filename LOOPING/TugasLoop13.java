package LOOPING;
import java.util.*;

public class TugasLoop13 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int deretAwal = 1;
       int deretSesudah = 1;
       System.out.print("Masukkan Jumlah Deret : ");
       int deret = input.nextInt();
       input.close();
       System.out.print(deretAwal + " " + deretSesudah);

       for (int i = 3; i <= deret; i++) {
        int deret3 = deretAwal + deretSesudah;
        System.out.print(" " + deret3);
        deretAwal = deretSesudah;
        deretSesudah = deret3;
       }
    }
}
