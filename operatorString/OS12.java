package operatorString;

public class OS12 {
    public static void main(String[] args) {
        String kalimat = "saya belajar pemrograman java bersama hummasoft di kelas industri";
        System.out.print(kalimat);
        String kata[] = kalimat.split(" ");
        System.out.println();
        System.out.println("Jumlah Kata : " + kata.length);
        System.out.print("Jumlah huruf : " + kalimat.length());
    }
}
