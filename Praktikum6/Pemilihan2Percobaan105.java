import java.util.Scanner;
public class Pemilihan2Percobaan105 {
        public static void main(String[] args) {
            Scanner input19 = new Scanner (System.in);
            System.out.print("Masukkan tahun : ");
            int tahun = input19.nextInt();
            
            if ((tahun % 4) == 0){
                if ((tahun % 100 != 0)){
                    System.out.println("Tahun Kabiset");

                }else if ((tahun % 400) == 0){
                    System.out.println("Tahun Kabisat");
                }else{
                      System.out.println("Bukan Tahun Kabiset");
                }
            } else
                System.out.println("Bukan Tahun Kabiset");
            }
}