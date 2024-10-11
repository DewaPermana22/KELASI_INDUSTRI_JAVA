package PERCABANGAN;
import java.util.*;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kriteria = "";

        System.out.print("Masukkan Nilai Anda : ");
        double nilai = input.nextDouble();

        if (nilai >= 80 && nilai <= 100) {
            kriteria = "A";
                }
        else if (nilai >= 70 && nilai < 81) {
            kriteria = "B";
                }
        else if (nilai >= 50 && nilai < 71) {
            kriteria = "C";
                }
        else if (nilai >= 20 && nilai < 51) {
            kriteria = "D";
                }
        else if (nilai >= 0 && nilai < 21 ) {
            kriteria = "E";
                }
        else {
            System.out.println("Nilai yang anda inputkan salah, silahkan ulangi dari range 0 s/d 100");
        }
        System.out.println("Nilai Anda : " + nilai + "\n" + "Kriteria Nilai Anda : " + kriteria);
        input.close();
    }
}
