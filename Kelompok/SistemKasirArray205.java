import java.util.Scanner;

public class SistemKasirArray205 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Membuat array dua dimensi untuk menyimpan informasi barang
        String[][] barang = new String[100][4];
        int jumlahBarang = 0;
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Keluar");
            
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = input.nextInt();
            
            if (pilihan == 1) {
                System.out.print("Nama barang: ");
                String nama = input.next();
                System.out.print("Harga barang: ");
                double harga = input.nextDouble();
                System.out.print("Jumlah stok: ");
                int stok = input.nextInt();
                double totalHarga = harga * stok;
                
                barang[jumlahBarang][0] = nama;
                barang[jumlahBarang][1] = Double.toString(harga);
                barang[jumlahBarang][2] = Integer.toString(stok);
                barang[jumlahBarang][3] = Double.toString(totalHarga);
                jumlahBarang++;
                
                System.out.println("Barang ditambahkan!");
            } else if (pilihan == 2) {
                System.out.println("Daftar barang:\n");
                System.out.println("Nama\tHarga\tStok\tTotal Harga\n");
                System.out.println("Minyak\t14000\t3\t42000");
                System.out.println("Beras\t15000\t4\t60000");
                System.out.println("Garam\t5000\t4\t20000");
                System.out.println("Gula\t13000\t2\t26000");
                System.out.println("Susu\t20000\t5\t100000");
                for (int i = 0; i < jumlahBarang; i++) {
                    System.out.println(barang[i][0] + "\t" + barang[i][1] + "\t" + barang[i][2] + "\t" + barang[i][3]);
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
  }