import java.util.Scanner;
public class percobaanA {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("* ");
                if((i+j)==9) {
                    break;
                }

            }
            System.out.println();
        }

    }
}
