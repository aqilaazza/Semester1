import java.util.Scanner;

public class SistemKasirArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi menyimpan nama barang
        String[] namaBarang = new String[5];
        // Deklarasi menyimpan harga barang
        int[] hargaBarang = new int[5];

        // Menambahkan data nama barang
        namaBarang[0] = "Minyak";
        namaBarang[1] = "Susu";
        namaBarang[2] = "Beras";
        namaBarang[3] = "Gula";
        namaBarang[4] = "Garam";

        // Menambahkan data harga barang
        hargaBarang[0] = 15000;
        hargaBarang[1] = 3000;
        hargaBarang[2] = 15000;
        hargaBarang[3] = 15000;
        hargaBarang[4] = 3000;

        // Menampilkan daftar barang
        System.out.println("Daftar Barang");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println(namaBarang[i] + " - Rp." + hargaBarang[i]);
        }

        // Menerima input nama barang
        System.out.print("Masukkan nama barang: ");
        String inputNamaBarang = sc.nextLine();

        // Mencari nama barang
        int indexNamaBarang = -1;
        for (int i = 0; i < namaBarang.length; i++) {
            if (namaBarang[i].equalsIgnoreCase(inputNamaBarang)) {
                indexNamaBarang = i;
                break;
            }
        }

        //Menjumlah banyaknya barang
        System.out.print("Jumlah barang : ");
        int jmlBarang = sc.nextInt();

        
        // Menampilkan harga barang
        if (indexNamaBarang != -1) {
            System.out.println("Harga " + inputNamaBarang + " adalah Rp." + hargaBarang[indexNamaBarang]);
        } else {
            System.out.println("Nama barang tidak ditemukan");
        }
    }
}
