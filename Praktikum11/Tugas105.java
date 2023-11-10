import java.util.Scanner;
public class Tugas105 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in); //membuat objek scanner untuk memassukkan inputan yang diberikan

        //Input nilai N (masukkan nilai n) serta menampilkan angka minimal 3 
        System.out.print("Masukkan nilai N (minimal 3): ");
        int n = sc05.nextInt(); //memasukkan serta menyimpan nilai int n 

        if (n >= 3 ) { //memeriksa nilai variabel bahwa n haruslah lebih dari atau sama dengan 3
        for(int i = 0; i <= n; i++) { //i = 0 dengan kondisi i <= nilai n yang telah diinputkan atau dimasukkan
            //perulangan untuk mencetak spasi n - i kali 
            for (int j = n; j >= i; j--) { //menganalisis variabel j ke nilai angka n 
                System.out.print(" "); //menghasilkan serta mecetak spasi ()
            }
            //perulangan untuk mencetak angka 1 sampai dengan angka i 
            for(int k = 1; k <= i; k++) {
                System.out.print(k); //mencetak nilai variabel k
            }
            System.out.println(); //umtuk mencetak baris baru atau mengenter
        } 
        }  else { //memeriksa nilai variabel apabila nilai n kurang dari 3
            System.out.println(" Nilai N minimal 3"); //hasil atau output apabila n kurang dari 3
        }
    }
}
