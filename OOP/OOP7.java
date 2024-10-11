package OOP;
import java.util.*;

class HitungBangunruang {
    public static class BangunRuang {
        double panjang, lebar, sisi, tinggi, jari_jari;

        public double volume() {
            return 0;
        }
    }

    public static class Balok extends BangunRuang {
        public Balok(double panjang, double lebar, double tinggi) {
            this.panjang = panjang;
            this.lebar = lebar;
            this.tinggi = tinggi;
        }

        @Override
        public double volume() {
            return panjang * lebar * tinggi;
        }
    }

    public static class Kubus extends BangunRuang {
        public Kubus(double sisi) {
            this.sisi = sisi;
        }

        @Override
        public double volume() {
            return sisi * sisi * sisi;
        }
    }

    public static class Kerucut extends BangunRuang {
        public Kerucut(double tinggi, double jari_jari) {
            this.tinggi = tinggi;
            this.jari_jari = jari_jari;
        }

        @Override
        public double volume() {
            return (1.0/3) * Math.PI * jari_jari * jari_jari * tinggi;
        }
    }

    public static class Tabung extends BangunRuang {
        public Tabung(double jari_jari, double tinggi) {
            this.jari_jari = jari_jari;
            this.tinggi = tinggi;
        }

        @Override
        public double volume() {
            return Math.PI * jari_jari * jari_jari * tinggi;
        }
    }
}

public class OOP7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user;
        do {
            System.out.println("PROGRAM MENGHITUNG VOLUME");
            System.out.println("-------------------------------------");
            System.out.println("\t1. Balok");
            System.out.println("\t2. Kubus");
            System.out.println("\t3. Kerucut");
            System.out.println("\t4. Tabung");
            System.out.print("PILIH : ");
            user = input.nextInt();

            switch (user) {
                case 1:
                    System.out.println("ANDA MEMILIH BALOK");
                    System.out.print("Masukkan Panjang Balok: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan Lebar Balok: ");
                    double lebar = input.nextDouble();
                    System.out.print("Masukkan Tinggi Balok: ");
                    double tinggi = input.nextDouble();
                    HitungBangunruang.Balok balok = new HitungBangunruang.Balok(panjang, lebar, tinggi);
                    System.out.println("Volume Balok: " + balok.volume());
                    break;
                case 2:
                    System.out.println("ANDA MEMILIH KUBUS");
                    System.out.print("Masukkan Sisi Kubus: ");
                    double sisi = input.nextDouble();
                    HitungBangunruang.Kubus kubus = new HitungBangunruang.Kubus(sisi);
                    System.out.println("Volume Kubus: " + kubus.volume());
                    break;
                case 3:
                    System.out.println("ANDA MEMILIH KERUCUT");
                    System.out.print("Masukkan Jari-Jari Kerucut: ");
                    double jari_jari = input.nextDouble();
                    System.out.print("Masukkan Tinggi Kerucut: ");
                    tinggi = input.nextDouble();
                    HitungBangunruang.Kerucut kerucut = new HitungBangunruang.Kerucut(tinggi, jari_jari);
                    System.out.println("Volume Kerucut: " + kerucut.volume());
                    break;
                case 4:
                    System.out.println("ANDA MEMILIH TABUNG");
                    System.out.print("Masukkan Jari-Jari Tabung: ");
                    jari_jari = input.nextDouble();
                    System.out.print("Masukkan Tinggi Tabung: ");
                    tinggi = input.nextDouble();
                    HitungBangunruang.Tabung tabung = new HitungBangunruang.Tabung(jari_jari, tinggi);
                    System.out.println("Volume Tabung: " + tabung.volume());
                    break;
                case 5:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Inputkan angka yang valid");
            }
        } while (user != 5);
        input.close();
    }
}
