package OperatorPemograman;
import java.util.Scanner;

public class OP16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean hasil;

        System.out.println("jawab pertanyaan dengan (ya) atau (tidak)");
        System.out.print("Apakah nilai anda lebih dari 70? : ");
        String jawab1 = input.nextLine();
        System.out.println("apakah absen anda tidak lebih dari 10? : ");
        String jawab2 = input.nextLine();
        input.close();

        hasil = (jawab1.equals("ya") && jawab2.equals("ya"));

    

        System.out.println(hasil ? "Selamaat! anda dinyatakan naik kelas" : "anda tidak naik kelas");
    }
    
}
