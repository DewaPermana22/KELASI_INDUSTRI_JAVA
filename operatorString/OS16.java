package operatorString;

public class OS16 {
    public static void main(String[] args) {
        String kalimat = "Siswa kelas industri sangat antusias untuk belajar di hari sabtu";
        char target = 's';
        System.out.println(kalimat);
        String rubahKalimat = kalimat.toLowerCase();
        char hurufKecil = Character.toLowerCase(target);

        int jumlah = 0;
        for (int i = 0; i < rubahKalimat.length(); i++) {
            if (rubahKalimat.charAt(i) == hurufKecil) {
                jumlah++;
            }
        }
        System.out.print("Jumlah huruf " + target + " dalam kalimat " + kalimat + " adalah : " + jumlah);
    }
}
