import java.util.Scanner;
public class PemilihanPercobaan205 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.println("Nilai UAS   :");
        float uas = input05.nextFloat();
        System.out.println("Nilai UTS   :");
        float uts = input05.nextFloat();
        System.out.println("Nilai Kuis  :");
        float kuis = input05.nextFloat();
        System.out.println("Nilai Tugas :");
        float tugas = input05.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi" ;
        System.out.println("Nilai akhir = " +total+ " sehingga " + message);

        if (total >80) {
            System.out.println("Kualifikasi nilai sangat baik nilai setara 4 dengan predikat A");
        } else if(total >73) {
            System.out.println("Kualifikasi nilai lebih baik nilai setara 3.5 dengan predikat B+");
        } else if(total >65) {
            System.out.println("Kualifikasi nilai baik nilai setara 3 dengan predikat B");
        } else if(total >60) {
            System.out.println("Kualifikasi nilai lebih dari cukup nilai setara 2.5 dengan predikat C+");
        } else if(total >50) {
            System.out.println("Kualifikasi nilai cukup nilai setara 2 dengan predikat C");
        } else if(total >39) {
            System.out.println("kualifikasi nilai kurang setara 1 dengan predikat D");
        } else if(total <=39) {
            System.out.println("Kualifikasi nilai gagal nilai setara 0 dengan predikat E");
        }
    }
}