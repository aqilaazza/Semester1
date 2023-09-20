import java.util.Scanner;
public class Gaji05 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;
    
        System.out.println("Masukkan jumlah hari masuk kerja anda: ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda: ");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan jumlah gaji: ");
        gaji=input.nextInt();
        System.out.println("Masukkan jumlah potongan gaji: ");
        potGaji=input.nextInt();
        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);

    }
    }
