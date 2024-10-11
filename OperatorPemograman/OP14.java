package OperatorPemograman;
import java.util.Scanner;

public class OP14 {
 public static void main(String[] args) {

    Scanner NISN = new Scanner(System.in);
    System.out.print("Inputkan NISN Anda : ");
    int NisnUser = NISN.nextInt(); 
    NISN.close();

    boolean nisnLulus = (NisnUser <= 1004);
    boolean lulus = nisnLulus == true;
    System.out.println("Anda lulus? :" + lulus);
 }   
}
