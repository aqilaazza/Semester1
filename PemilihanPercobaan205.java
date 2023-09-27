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
    }
}