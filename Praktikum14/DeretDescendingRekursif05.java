import java.util.Scanner;
public class DeretDescendingRekursif05 {
    // Fungsi Rekursif
    static void deretRekursif(int n) {
        if (n >=  0) {
            System.out.print(n + " ");
            deretRekursif(n-1);
        }
    }
    //Fungsi Iteratif
    static void deretIteratif(int n) {
        for(int i = n; i >= 0; i-- ) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        System.out.println("Nilai deret rekursif adalah : ");
        deretRekursif(n); 
        System.out.println("\nNilai deret Iteratif adalah : ");
        deretIteratif(n);
    }
}