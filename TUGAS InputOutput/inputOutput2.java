import java.util.Scanner;

public class inputOutput2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Nama Sekolah : ");
       String namaSekolah = input.nextLine();
       System.out.println("Jarak rumah ke sekolah : ");
       double jarak = input.nextDouble();
       System.out.println("Kode plat kendaraan : ");
       char kode = input.next().charAt(0);
       System.out.println("Anda anak ke berapa? : ");
       int anak = input.nextInt();
       input.close();

       System.out.println("Nama sekolah : " + namaSekolah);
       System.out.println("Jarak dari rumah : " + jarak + "KM");
       System.out.println("Kode Plat Kendaraan : " + kode);
       System.out.println("Anak Ke : " + anak);
    }
}
