package LOOPING;
import java.util.*;

public class TugasLoop7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("inputkan angka : ");
        int user = input.nextInt();
        input.close();
        int awal = 3;
        int pola = 2;

        for (int i = 0; i < user; i++) {
            System.out.println(awal + " ");
            awal += pola;
            pola++;
        }
    }
}
