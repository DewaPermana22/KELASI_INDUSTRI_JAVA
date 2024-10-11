package OperatorPemograman;
import java.util.Scanner;

public class OP13 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);

        System.out.println("jawablah pertanyaan di bawah ini!!");
        System.out.println("BERIKUT INI MANAKAH YANG TERMASUK OPERATOR DI DALAM PEMOGRAMAN JAVA?");
        String pilihan = """
                a. Operator Telkomsel
                b. Operator Aritmatika
                c. Operator Indosat
                d. Operator Assigment
                """;
        System.out.println(pilihan);
        System.out.println("masukkan jawaban yang benar : ");
        String answer1 = answer.nextLine();
        answer.close();
        
        boolean benar1 = answer1.equals("b");
        boolean benar2 = answer1.equals("d");
        boolean hasil = benar1 || benar2;

        System.out.println("Jawaban anda : " + answer1);
        System.out.println("Hasil Jawaban anda : " + hasil);
        
    }
}
