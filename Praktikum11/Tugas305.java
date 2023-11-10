import java.util.Scanner;
public class Tugas305 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3) : ");
        int n = sc05.nextInt();

        if (n >= 3) {
            for (int i =0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i==0 || i == n-1 || j == 0|| j== n-1) {
                        System.out.print(n + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai N minimal 3");
        }
    }
}