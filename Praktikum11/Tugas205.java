import java.util.Scanner;
public class Tugas205 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 5) : ");
        int n = sc05.nextInt();

        if (n >= 5) {
        for(int i = n; i >= 1; i-- ) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } else {
        System.out.println("Nilai N minimal 5");
    }
    }
}
