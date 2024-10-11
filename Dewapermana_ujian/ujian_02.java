package Dewapermana_ujian;

import java.util.Scanner;

public class ujian_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai a : ");
        int a = input.nextInt();
        System.out.print("Masukan nilai b : ");
        int b = input.nextInt();
        System.out.print("Masukan nilai c : ");
        int c = input.nextInt();
        System.out.print("Masukan nilai d : ");
        int d = input.nextInt();
        input.close();
        int output = a + b * c / d;
        System.out.println("---------------------");
        System.out.println(output);
    }
}
