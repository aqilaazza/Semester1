import java.util.Scanner;
public class HargaBayar05 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int harga, jumlah, halBuku;
        double dis, total, bayar, jmlDis;
        String merk ;
        System.out.println("Masukkan nama merk buku: ");
        merk=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku: ");
        halBuku=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli: ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah=input.nextInt();
        System.out.println("Masukkan jumlah diskon: ");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}