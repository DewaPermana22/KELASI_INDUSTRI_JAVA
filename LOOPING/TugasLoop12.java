package LOOPING;
import java.util.*;

public class TugasLoop12 {
    public static void main(String[] args) {
        int pilihan;
        String program = "";
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("---------------------");
            System.out.println("MENU : ");
            System.out.println("1. PENGURANGAN");
            System.out.println("2. PENJUMLAHAN");
            System.out.println("3. KELUAR");
            System.out.print("Masukkan menu pilihan : ");
            pilihan = input.nextInt();
            System.out.println("---------------------");
            
            if (pilihan == 1) {
                program = "PENGURANGAN";
            } else if (pilihan == 2) {
                program = "PENJUMLAHAN";
            } else if (pilihan == 3) {
                program = "KELUAR";
            }else{
                System.out.println("inputan anda salah");
            }
            System.out.println("yang anda pilih : " + program);
            System.out.println("---------------------");
        } while(pilihan != 3);
        input.close();
}
}
