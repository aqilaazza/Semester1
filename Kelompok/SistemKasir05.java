import java.util.Scanner;
public class SistemKasir05 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan barang : ");
        String item = input.nextLine();
        System.out.print("Harga Barang : ");
        int harga = input.nextInt();
        System.out.print("Jumlah Barang :");
        int kuantitas = input.nextInt();
        int total = harga * kuantitas;
        System.out.print("Total Belanja : \n" + kuantitas +" " + item + "Seharga Rp" + total);
     }
     }