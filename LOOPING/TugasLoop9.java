package LOOPING;
import java.util.*;
public class TugasLoop9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = input.nextInt();
        input.close();
        int faktorial = 1;
    
        for (int i = 1; i <= angka; i++) {
            faktorial *= i;
        }
        System.out.println(angka + " faktorial " + " adalah " + faktorial);
    }
}
