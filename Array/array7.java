package Array;

public class array7 {
    public static void main(String[] args) {
        String stock [][] = {
            {"1", "Xiaomi", "PocoM3", "1850000"},
            {"2", "Oppo", "Reno6", "4299000"},
            {"3", "Vivo", "Y2", "1635000"},
            {"4", "Oppo", "A15", "1618500"},
            {"5", "Samsung", "Galaxy A12", "1990000"},
        };
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                System.out.print(stock[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
