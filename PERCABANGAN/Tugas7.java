package PERCABANGAN;
import java.util.*;

public class Tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan Angka 1 :");
        int angka1 = input.nextInt();
        System.out.print("Inputkan Angka 2 :");
        int angka2 = input.nextInt();
        System.out.println("==========");
        System.out.println("angka 1 : " + angka1);
        System.out.println("angka 2 : "+ angka2);
        System.out.println("==========");
        input.close();

        if (angka1 > angka2) {
           System.out.println("angka 1 lebih besar dari angka 2"); 
        } else if (angka1 < angka2) {
            System.out.println("angka 2 lebih besar dari angka 1");
        }else{
            System.out.println("mohon inputkan angka");
        }
    }
}
