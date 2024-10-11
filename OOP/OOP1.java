package OOP;

class Pustaka {
    private int id;
    private String judul;
    private int jumlah;

    public Pustaka (int id, String judul, int jumlah){
        this.id = id;
        this.judul = judul;
        this.jumlah = jumlah;
    }

    public void setID(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getJudul(){
        return this.judul;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public int getJumlah(){
        return this.jumlah;
    }
}
public class OOP1 {
    
    public static void main(String[] args) {
        Pustaka buku = new Pustaka(0, " ", 0);
        buku.setID(101);
        buku.setJudul("Habis Gelap Terbitlah Terang");
        buku.setJumlah(10);
       System.out.println("ID : " + buku.getId() + "\nJudul : " + buku.getJudul() + "\nJumlah : " + buku.getJumlah());
    }
}
