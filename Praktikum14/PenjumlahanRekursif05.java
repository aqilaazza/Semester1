import java.util.Scanner;
public class PenjumlahanRekursif05 {

    static int hitungPenjumlahanBilangan(int n) {
        if (n < 0 ) {
          return (0);
        } else {
            return (n + hitungPenjumlahanBilangan(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        int hasil = hitungPenjumlahanBilangan(n);

        System.out.println("Penjumlahan dari 1 hingga " +n+ " adalah " + hasil);
    }
}
