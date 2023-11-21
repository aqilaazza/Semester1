import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Atlet {
    String nama;
    String cabangOlahraga;

    public Atlet(String nama, String cabangOlahraga) {
        this.nama = nama;
        this.cabangOlahraga = cabangOlahraga;
    }

    public String getNama() {
        return nama;
    }

    public String getCabangOlahraga() {
        return cabangOlahraga;
    }
}

public class Tugas405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Atlet> daftarAtlet = new ArrayList<>();

        // Input data atlet
        for (String cabang : new String[]{"badminton", "tenis meja", "basket", "bola voly"}) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("\nInput data atlet " + cabang + " ke-" + i);
                System.out.print("Nama Atlet: ");
                String namaAtlet = scanner.nextLine();

                // Menambahkan atlet ke dalam ArrayList
                daftarAtlet.add(new Atlet(namaAtlet, cabang));
            }
        }

        // Mengurutkan ArrayList berdasarkan nama atlet (ascending)
        Collections.sort(daftarAtlet, Comparator.comparing(Atlet::getNama));

        // Menampilkan informasi atlet yang telah diurutkan
        System.out.println("\n=== Daftar Atlet Porseni 2024 ===");
        for (Atlet atlet : daftarAtlet) {
            System.out.println("Cabang Olahraga: " + atlet.getCabangOlahraga() + ", Nama Atlet: " + atlet.getNama());
        }

        // Menutup scanner
        scanner.close();
    }
}
