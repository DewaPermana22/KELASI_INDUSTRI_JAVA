package OperatorPemograman;

public class OP7 {
    public static void main(String[] args) {

        int nilai1 = 15;
        int nilai2 = 20;
        System.out.println("nilai1 : " + nilai1 + "\n" + "nilai2 : " + nilai2);

        // Perbandingan

        boolean samadengan = nilai1 == nilai2;
        System.out.println("nilai1 sama dengan nilai2? : " + samadengan);
        boolean tidakSamaDengan = nilai1 != nilai2;
        System.out.println("nilai1 tidak sama dengan nilai2? : " + tidakSamaDengan);
        boolean lebihBesar = nilai1 > nilai2;
        System.out.println("nilai1 lebih besar dari nilai2? : " + lebihBesar);
        boolean lebihKecil = nilai1 < nilai2;
        System.out.println("nilai1 lebih kecil dari nilai2? : " + lebihKecil);
        boolean lebihBesarSamaDengan = nilai1 >= nilai2;
        System.out.println("nilai1 lebih besar sama dengan nilai2? : " + lebihBesarSamaDengan);
        boolean lebihKecilSamaDengan = nilai1 <= nilai2;
        System.out.println("nilai1 lebih kecil sama dengan nilai2? : " + lebihKecilSamaDengan);
    }
}
