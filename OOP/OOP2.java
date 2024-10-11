package OOP;

class Mobil {
    String namaMobil;
    double kecepatan;
    int roda;
    String tipe;

    public Mobil(String namaMobil, double kecepatan, int roda, String tipe){
        this.namaMobil = namaMobil;
        this.kecepatan = kecepatan;
        this.roda = roda;
        this.tipe = tipe;
    }

    public void setNamaMObil(String namaMobil){
        this.namaMobil = namaMobil;
    }
    public String getNamaMobil(){
        return this.namaMobil;
    }
    public void setKecepatan(double kecepatan){
        this.kecepatan = kecepatan;
    }
    public double getKecepatan(){
        return this.kecepatan;
    }
    public void setRoda(int roda){
        this.roda = roda;
    }
    public int getRoda(){
        return this.roda;
    } 
    public void setType(String tipe){
        this.tipe = tipe;
    }
    public String getType(){
        return this.tipe;
    }
}

public class OOP2 {
    public static void main(String[] args) {
        Mobil baru = new Mobil(null, 0, 0, null);
        baru.setNamaMObil("Avanza");
        baru.setKecepatan(270);
        baru.setRoda(4);
        baru.setType("CUV");
        System.out.println("----- Mobil " + baru.getNamaMobil() + " -----");
        System.out.println("Kecepatan : " + baru.getKecepatan());
        System.out.println("Tipe : " + baru.getType());
        System.out.println("Roda : " + baru.getRoda());
    }
}
