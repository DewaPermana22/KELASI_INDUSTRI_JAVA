import java.util.Scanner;

public class inputOutput1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Masukkan Nama Anda : ");
       String nama = input.nextLine();
       System.out.println("Masukkan Usia Anda : ");
       int usia = input.nextInt();
       System.out.println("Masukkan kota asal anda : ");
       String asal = input.next();
       System.out.println("Masukkan Tinggi Badan Anda : ");
       double tinggiBadan = input.nextDouble();
       input.close(); 

       System.out.println("Nama : " + nama);
       System.out.println("usia : " + usia);
       System.out.println("Asal : " + asal);
       System.out.println("Tinggi badan : " +  tinggiBadan);
    }
}
