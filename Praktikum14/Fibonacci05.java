import java.util.Scanner;
public class Fibonacci05 {

    static int hitungMarmut (int b) {
        if (b <= 2) {
           return(1);
        } else {
            return hitungMarmut(b -1) + hitungMarmut (b - 2);
        }
    }

    public static void main(String[] args) {
        
        int b = 12;
        int jumlahAkhirMarmut = hitungMarmut(b);
        System.out.println("Marmut pada bulan ke - " + b+ " adalah " +jumlahAkhirMarmut);
    }
}