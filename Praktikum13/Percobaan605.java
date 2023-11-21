//Pembuatan kode program, dengan fungsi versus tanpa fungsi

import java.util.Scanner;

public class Percobaan605 {
        static int hitungLuas (int pjg, int lb) {
            int Luas = pjg * lb;
            return Luas;
        }
        //Fungsi hitungVolume
     static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas (a,b) * tinggi;
        return volume;
     }

    //Fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int p,l,t,L, vol;
        System.out.print("Masukkan panjang : ");
        p = input.nextInt();
        System.out.print("masukkan lebar : ");
        l = input.nextInt();
        System.out.print("masukkan tinggi : ");
        t = input.nextInt();

        L = hitungLuas(p,l);
        System.out.println("Luas Persegi Panjang adalah " +L);
        vol = hitungVolume(t,p,l);
        System.out.println("Volume balok adalah " +vol);
    
    }
    }


