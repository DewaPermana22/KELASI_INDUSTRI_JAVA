import java.util.Scanner;

public class challange6 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.println("Inputkan nilai tugas anda : ");
     double nilaiTugas = input.nextDouble();

     System.out.println("Inputkan nilai Ujian anda : ");
     double nilaiUjian = input.nextDouble();

     if ( nilaiUjian < 0.0 || nilaiUjian > 100.0 || nilaiTugas < 0.0 || nilaiTugas > 100.0 ) {
        System.out.println("Silahkan menginputkan ulang nilai anda!!  ");
        System.exit(0); 
      }
        else {
        System.out.println("Nilai yang anda masukkan sudah sesuai aturan!!"); }
     input.close();

     double nilaiAkhir = (0.6 * nilaiUjian) + (0.4 * nilaiTugas);
     System.out.println("Nilai Akhir Anda adalah : " + nilaiAkhir);
     if ( nilaiAkhir >= 60.0 ) {
        System.out.println("Selamat anda dinyatakan lulus!");
     } else {
            System.out.println("Maaf anda belum lulus");
        }
     }
    }
