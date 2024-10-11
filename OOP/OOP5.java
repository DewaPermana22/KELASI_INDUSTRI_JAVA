package OOP;

import javax.swing.*;

class kura_kura {
    private int kesehatan;
    private int kekuatan;
    private int pengalaman;

    public kura_kura() {
        this.kesehatan = 0;
        this.kekuatan = 0;
        this.pengalaman = 0;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public void setPengalaman(int pengalaman) {
        this.pengalaman = pengalaman;
    }

    public int getPengalaman() {
        return pengalaman;
    }

    public void makan() {
        kesehatan += 2;
        kekuatan += 3;
    }

    public void berjalan() {
        kesehatan -= 1;
        kekuatan -= 1;
        pengalaman += 2;
    }

    public void bertarung() {
        kesehatan -= 2;
        kekuatan -= 3;
        pengalaman -= 3;
    }

    public void minum() {
        kesehatan += 1;
        kekuatan += 1;
    }

    public void status() {
        JOptionPane.showMessageDialog(null, "Kesehatan : " + getKesehatan() + "\nKekuatan : " + getKekuatan()
                + "\nPengalaman : " + getPengalaman());
    }
}

public class OOP5 {

    public static void main(String[] args) {
        kura_kura baru = new kura_kura();
        while (true) {
            int input = Integer.parseInt(JOptionPane.showInputDialog("1. Kura-Kura Makan" + "\n2. Kura-Kura Berjalan"
                    + "\n3. Kura-Kura Bertarung" + "\n4. Kura-Kura Minum" + "\n5. Exit"));
            if (input == 1) {
                baru.makan();
            } else if (input == 2) {
                baru.berjalan();
            } else if (input == 3) {
                baru.bertarung();
            } else if (input == 4) {
                baru.minum();
            } else if (input == 5) {
                JOptionPane.showMessageDialog(null, "Program Selesai");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Mohon masukkan angka yang valid");
                continue;
            }
            baru.status();
            if (baru.getKesehatan() < 0 && baru.getKekuatan() < 0 && baru.getPengalaman() < 0) {
                JOptionPane.showMessageDialog(null, "Anda Kalah!");
            }
        }
    }
}