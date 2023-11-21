//Pembuatan kode program, dengan fungsi versus tanpa fungsi

import java.util.Scanner;
public class Percobaan605 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan panjang : ");
        p = input.nextInt();
        System.out.println("Masukkan lebar : ");
        l = input.nextInt();
        System.out.println("Masukkan tinggi : ");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah : " +L);

        vol = p * l * t;
        System.out.println("Volume balok adalah : " +vol);
     }

     //Fungsi hitungLuas
     static int hitungVolume (int t, int a, int b) {
        int vol = hitungLuas (a,b) * t;
        return vol;
     }

     private static int hitungLuas(int a, int b) {
        return 0;
    }

    //Fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int p,l,t,L, vol;
        System.out.println("Masukkan panjang : ");
        p = input.nextInt();
        System.out.println("masukkan lebar : ");
        l = input.nextInt();
        System.out.println("masukkan tinggi : ");
        t = input.nextInt();

        L = hitungLuas(p,l);
        System.out.println("Luas Persegi Panjang adalah " +L);
        vol = hitungVolume(t,p,l);
        System.out.println("Volume balok adalah " +vol);
     }
}

