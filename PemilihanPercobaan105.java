import java.util.Scanner;
public class PemilihanPercobaan105 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input05.nextInt();
        String hasil;

        hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println(angka + " merupakan " + hasil);
    }
}