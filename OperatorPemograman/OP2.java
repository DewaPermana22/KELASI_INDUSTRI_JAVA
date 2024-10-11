package OperatorPemograman;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OP2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Masukkan nilai a : ");
        int a = Integer.parseInt(input.readLine());

        System.out.println("Masukkan nilai b : ");
        int b = Integer.parseInt(input.readLine());

        System.out.println("Masukan nilai c : ");
        int c = Integer.parseInt(input.readLine());

        int hasil = a + (b*c);
        System.out.println("Hasil Dari A + B * C adalah = " + hasil);
        input.close();
        
    }
}
