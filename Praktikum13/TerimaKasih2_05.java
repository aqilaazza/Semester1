//Membuat Fungsi DENGAN Parameter

import java.util.Scanner;
public class TerimaKasih2_05 {

    //diambil dari percobaan sebelumnya
    public static void UcapanTerimaKasih() {
        System.out.println("Thank you for being the best teacher in the world.\n" + 
        "You inspired in me a love for learning and made me fell like I could ask you anything.");
    }
    //
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
    //memangil UcapanTerimaKasih
    public static void main(String[] args) {
        UcapanTerimaKasih();
        //memanggil UcapanTambahan
        String ucapan = "Terimakasih Pak.. Bu... Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }
}
