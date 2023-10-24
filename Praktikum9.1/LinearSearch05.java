import java.util.Scanner;

public class LinearSearch05 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);

       
        System.out.print("Masukkan jumlah element array : ");
        int a =sc.nextInt();

        int[] arrayInt = new int[a];
        for (int i = 0; i < a ; i++ ) {
            System.out.print("Masukkan elemen nilai Array ke- " +(i)+ " : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang dicari : ");
        int key = sc.nextInt();

        int hasil = 1;
        for (int i = 0; i < a ; i++) {
            if (arrayInt[i] == key ) {
                hasil = i;
                System.out.println("Key ada di posisi indeks ke- " +hasil);
    }  else {
        System.out.println("Key tidak ditemukan ");
        break;
    }
    }
}
        
 } 
