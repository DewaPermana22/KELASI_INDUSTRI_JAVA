package OOP;
class user{
    private String nama;
    private String password;

    public user(String nama, String password){
        this.nama = nama;
        this.password = password;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setPaswword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}
public class OOP4 {
    public static void main(String[] args) {
        user pertama = new user(" ", " ");
        pertama.setNama("mr.x");
        pertama.setPaswword("eskopisusu");
        System.out.println("username : " + pertama.getNama() + "\nPassword : " + pertama.getPassword());
        if (pertama.getPassword().length() < 8) {
            System.out.println("password tidak cocok");
        } else {
            System.out.println("password cocok");
        }
    }
}
