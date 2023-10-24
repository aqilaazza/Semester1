import java.util.Scanner;

public class TugasSorting05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Masukkan jumlah element : ");
        int banyakElemen =sc.nextInt();
       
        
        int[] arrayInt = new int[banyakElemen];
        for (int i = 0; i < banyakElemen ; i++ ) {
            System.out.print("Masukkan elemen nilai ke- " +(i)+ " : ");
            arrayInt[i] = sc.nextInt();
    }

        int tertinggi = arrayInt[0];
        int terendah = arrayInt[0];
        int jumlah = arrayInt[0];

    for (int i = 0; i < banyakElemen; i++) {
        if (arrayInt[i] > tertinggi) {
            tertinggi =  arrayInt[i];
        }
        else if (arrayInt[i] < terendah) {
            terendah = arrayInt[i]; 
        }
        jumlah += arrayInt[i];
    
    }

    double rata = (double) jumlah/banyakElemen;
    System.out.println("Nilai tertinggi : " + tertinggi);
    System.out.println("Nilai terendah : " + terendah);
    System.out.println("Nilai rata-rata " + rata);

}
}