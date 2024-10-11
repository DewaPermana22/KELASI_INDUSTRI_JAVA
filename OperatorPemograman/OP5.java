package OperatorPemograman;
import javax.swing.JOptionPane;

public class OP5 {
    public static void main(String[] args) {
        
        int sirup = 5;
        int detergent = 6;
        int mieInstan = 10;

        int stock1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Sirup Yang Baru Datang : "));
        int stock2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Detergent Yang Baru Datang : "));
        int stock3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Mie Instan Yang Baru Datang : "));

        sirup += stock1;
        detergent += stock2;
        mieInstan += stock3;

        String stockAkhir = "Berikut ini adalah jumlah stock barang di toko : " + "\n" + "Sirup \t : " + stock1 + "\n" + "Detergent \t : " + stock2 + "\n" + "Mie Instan \t : " + stock3;
        JOptionPane.showMessageDialog(null, stockAkhir);

    }
}
