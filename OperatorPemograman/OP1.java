package OperatorPemograman;
import java.util.Scanner;

public class OP1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Penghitung luas segitiga Masukkan tinggi dan alas dalam cm");
    System.out.println("Masukan Alas segitiga : ");
    double alas = input.nextDouble();
    System.out.println("Masukan Tinggi segitiga : ");
    double tinggi = input.nextDouble();

    double hasil = 1/2 * alas * tinggi;
    System.out.println("Alas yang anda inputkan : " + alas + "cm");
    System.out.println("Tinggi yang anda inputkan : " + tinggi + "cm");
    System.out.println("Luas Segitiga Adalah : " + hasil + "cm");
    input.close();
  }  
}
