import java.util.Scanner;
public class Tugas205 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in); //membuat objek scanner untuk memassukkan inputan yang diberikan
        System.out.print("Masukkan nilai N (minimal 5) : "); //menginputkan angka N dengan minimal angka 5
        int n = sc05.nextInt(); //memasukkan input int n untuk disimpan 

        if (n >= 5) { //mengatur untuk memerikasa agar n harus lebih dari atau sama dengan 5
        for(int i = n; i >= 1; i-- ) { //menganalisis variabel i ke dalam nilai n serta memeriksa nilai i harus lebih dari atau sama dengan 1
                                        // serta untuk mengurangui 1 nilai i
            for (int j = 1; j <= i; j++) { // menganalisis nilai j = 1 serta nilai j harus samadengan arau kurang dari i 
                System.out.print("*"); // mencetak tanda * sebanyak j<=i
            }
            System.out.println(); ////umtuk mencetak baris baru atau mengenter
        }
    } else { //memeriksa variabel apa bila n kurang dari 5
        System.out.println("Nilai N minimal 5"); // hasil atau output apabila n kurang dari 5
    }
    }
}
