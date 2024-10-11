package OperatorPemograman;
import java.util.Scanner;

public class OP9 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Jawaban Harus Benar agar anda mendapat nilai sempurna!!");
        System.out.print("Masukkan Jawaban Anda : ");
        String jawaban = user.nextLine();
        System.out.print("Masukan jawaban anda : ");
        String jawaban2 = user.nextLine();
        user.close();
        
        boolean jawaban3 = jawaban.equals("a");
        boolean jawaban4 = jawaban2.equals("b");

        boolean benar = jawaban3 && jawaban4;
        System.out.println("Jawaban anda sudah benar semua? : " + benar);

        // jika satu false maka false

    }
   
}
