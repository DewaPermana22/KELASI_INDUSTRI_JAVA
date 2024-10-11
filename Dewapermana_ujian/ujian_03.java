package Dewapermana_ujian;

import java.util.Scanner;

public class ujian_03 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan nilai 1 : ");
       int nilai1 = input.nextInt();
       System.out.print("Masukkan nilai 2 : ");
       int nilai2 = input.nextInt();
       System.out.print("Masukkan nilai 3 : ");
       int nilai3 = input.nextInt();
       input.close();
       double output = (nilai1 + nilai2 + nilai3) / 3;
       boolean benar = output > 75;
       System.out.println(" Rata rata nilai : " + output);
       System.out.println(benar? "Naik kelas" : "tidak naik");  
    }
}
