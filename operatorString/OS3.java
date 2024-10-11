package operatorString;

import java.util.Scanner;

public class OS3 {
    public static void main(String[] args) {
        String[] isi = new String[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < isi.length; i++) {
            System.out.print("Inputkan array " + i + " : ");
            isi[i] = input.nextLine();
        }
        System.out.println("---------------------");
        for (int i = 0; i < isi.length; i++) {
            if (isi[i].isEmpty()) {
                System.out.println("Array ke " + i + " : " + "Kosong");
            } else{
                System.out.println("Array ke " + i + " : " + isi[i]);
            }
        }
        input.close();
    }
}
