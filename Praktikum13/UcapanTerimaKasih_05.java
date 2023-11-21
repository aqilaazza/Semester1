//Fungsi yang dapat meng-Calling Fugsi lain

import java.util.Scanner;

public class UcapanTerimaKasih_05 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        System.out.println("Thank you " + PenerimaUcapan() +
                " for being the best teacher in the world\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything");
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        //memanggil ucapan tambahan
        String ucapan = "Hope you alwaays be happy in your live";
        UcapanTambahan(ucapan);
    }
}

