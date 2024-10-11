package operatorString;

public class OS8 {
    public static void main(String[] args) {
        String kalimat1 = "HUMMASOFT TECHNOLOGY MALANG";
        String kalimat2 = "kelas industri bergengsi di indonesia";
        String kata1 = "hummasoft ";
        String kata2 = "MEMPUNYAI PRODUK ";
        String kata3 = "sistem sekolah";
        kata1.toUpperCase();
        kata2.toLowerCase();
        kata3.toUpperCase();
        String kalimat3 = kata1 + kata2 + kata3;
        System.out.println(kalimat1.toLowerCase());
        System.out.println(kalimat2.toUpperCase());
        System.out.println(kalimat3);
    
    }
}
