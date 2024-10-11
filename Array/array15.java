package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class array15 {
    public static void main(String[] args) {
        ArrayList<Integer> listAngka = new ArrayList<>((Arrays.asList(10,20,30,40,50)));
        for (int i = 0; i < listAngka.size(); i++) {
            System.out.print(listAngka.get(i) + " ");
        }
        System.out.println("\nMenambahkan angka dari 60 s/d 80");
        listAngka.add(60);
        listAngka.add(70);
        listAngka.add(80);
        for (int i = 0; i < listAngka.size(); i++) {
            System.out.print(listAngka.get(i) + " ");  
        }
    }
}
