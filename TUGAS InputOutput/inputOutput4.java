import javax.swing.JOptionPane;

public class inputOutput4 {
    public static void main(String[] args) {
        String Nama = JOptionPane.showInputDialog("Masukkan nama : ");
        int Nisn = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nisn : "));
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Usia Anda : "));

        String Output = "Nama : " + Nama + "\n" + "Nisn : " + Nisn + "\n" + "Usia : " + umur + "\n";
        JOptionPane.showMessageDialog(null, Output);
    }
}
