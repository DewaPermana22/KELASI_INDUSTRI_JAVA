package operatorString;

public class OS7 {
    public static void main(String[] args) {
        String kalimat = "Di kantor Hummasoft saat ini sedang memelihara dua hewan lucu, tapi suka menghancurkan tangkai tanaman yang ada di halaman kantor";
        String[][] ganti = {
            {"hewan", "binatang"},
            {"tangkai", "pohon"},
            {"tanaman", "tumbuhan"},
        };
        System.out.println("=====Sebelum=====");
        System.out.println(kalimat);
       for (String[] replace : ganti) {
        kalimat = kalimat.replaceAll(replace[0], replace[1]);
       }
       System.out.println("=====Sesudah=====");
       System.out.println(kalimat);
    }
}
