import java.util.Scanner;

public class kubus05 {

static int hitungVolumeKubus(int sisi) {
    int volume = sisi * sisi * sisi;
    return volume;
}
static int hitungLuasPermukaanKubus (int sisi) {
    int luasPermukaan = 6 * sisi * sisi;
    return luasPermukaan; 
}

public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int v, sisi, Lp;
    System.out.print("Masukkan nilai sisi kubus : ");
    sisi = sc.nextInt();


    v = hitungVolumeKubus(sisi);
    System.out.println("Volume kubus adalah " + v);
    Lp = hitungLuasPermukaanKubus(sisi);
    System.out.println("Luas Permukaan kubus adalah " + Lp);
    
}

}
