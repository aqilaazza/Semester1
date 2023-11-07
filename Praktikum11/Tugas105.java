import java.util.Scanner;
public class Tugas105 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = sc05.nextInt();

        for(int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
