import java.util.Scanner;
public class Tugas305 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in); //membuat objek scanner untuk memassukkan inputan yang diberikan

        //Input nilai N (masukkan nilai n) serta menampilkan angka minimal 3
        System.out.print("Masukkan nilai N (minimal 3) : ");
        int n = sc05.nextInt(); //memasukkan serta menyimpan nilai int n 

        if (n >= 3) { //memeriksa nilai variabel bahwa n haruslah lebih dari atau sama dengan 3
            for (int i =0; i < n; i++) { // analisa variabeli i ke 0, i harus lebih kecil dari pada n dan menambahkan 1 pada nilai i setelah iterasi
                for (int j = 0; j < n; j++) { //inersiasi dari 0 sampai i- 1 serta menambahkan 1 pada nilai i setelah iterasi
                    if (i==0 || i == n-1 || j == 0|| j== n-1) { //memeriksa variabel i atau j = 0 atau n-1
                        System.out.print(n + " "); // mencetak variabel dan diberi 1 spasi setelah mencetak angka
                    } else { //kondisi lain
                        System.out.print("  "); // mencetak variabel dan diberi 2 spasi setelah mencetak angka
                    }
                }
                System.out.println(); //untuk mencetak baris baru atau mengenter
            }
        } else { // //memeriksa nilai variabel apabila nilai n kurang dari 3
            System.out.println("Nilai N minimal 3"); //hasil atau output apabila n kurang dari 3
        }
    }
}