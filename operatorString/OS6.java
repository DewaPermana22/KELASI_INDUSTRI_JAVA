package operatorString;

public class OS6 {
    public static void main(String[] args) {
        String angka[] = {"1","2","3"};
        String kalimat[] = {"Hummasoft technology", "Software House asal Malang", "yang membangun kelas industri"};
        for (int i = 0; i < kalimat.length; i++) {
                System.out.println(angka[i].concat(". " + kalimat[i]));
            }
    }
}
