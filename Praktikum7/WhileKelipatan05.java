import java.util.Scanner;

public class WhileKelipatan05 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int kelipatan, jumlah=0, counter=0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) {
            i++;
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total Bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        scan.close();
    }
}