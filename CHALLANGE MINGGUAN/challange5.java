import java.util.Scanner;

public class challange5 {
    public static void main(String[] args) {
        Scanner jawaban = new Scanner(System.in);

        System.out.println("QUIZ CHALLENGE 5");
        System.out.println("=================");
        System.out.println("Dimanakah dibawah yang termasuk operator logika");
        String pilihan = """
                A. Operator Logika
                B. Operator Telkomsel
                C. Operator Indosat
                D. Operator Perbandingan
                """;
        System.out.println(pilihan);
        System.out.print("Masukan Jawaban anda : ");
        String answer = jawaban.nextLine().toUpperCase();

        String yangBenar = "A";

        jawaban.close();

        boolean Benar = answer.equals(yangBenar) && pilihan.contains(answer + ".");

        String hasil = Benar ? "Jawaban benar!" : "Jawaban salah!";
        System.out.println(hasil);
    }
}
