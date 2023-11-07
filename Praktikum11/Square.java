import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilain N = ");
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++){
                System.out.print("*");
            }
           System.out.println();
        }
        
    }
}
