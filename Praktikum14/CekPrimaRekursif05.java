import java.util.Scanner;
public class CekPrimaRekursif05 {

    static boolean cekPrima (int n, int i)  {
        if (n <= 1) {
            return false;
        } 
        if (i == 2) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return cekPrima (n, i-1);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        boolean hasil = cekPrima(n, n/2);

        if (hasil) {
         System.out.println(n + " merupakan bilangan prima");
        } else {
         System.out.println(n + " bukan bilangan prima");
        }
    }
}