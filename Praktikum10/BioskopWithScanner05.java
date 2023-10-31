import java.util.Scanner;
public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, umur, menu;
        String nama, next, exit;
        long noTlp;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Masukkan data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();
            sc.nextLine();

        switch (menu) {
            case 1 : 
            //input data penonton
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();
            System.out.print("Masukkan umur : ");
            umur = sc.nextInt();
            System.out.print("Masukkan nomer telphone : ");
            noTlp = sc.nextLong();

            System.out.print("Masukkan baris : ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = sc.nextInt();
            sc.nextLine();

            if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                System.out.println("Nomor baris/kolom kursi tidak tersedia.");
                System.out.println("Coba lagi.");
                continue;
            }

            if (penonton[baris - 1][kolom - 1] != null) {
                System.out.println("Kursi sudah terisi.");
                System.out.println("Coba lagi ");
                System.out.print("Masukkan baris : ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom = sc.nextInt();
            }

            penonton [baris-1] [kolom-1] = nama;
            break;
    

            case 2 :
            for (int i = 0; i < penonton.length; i++) {
                for (int a = 0; a < penonton[i].length; a++) {
                if (penonton[i][a] != null) {
                    System.out.println("Penonton berada pada baris " + (i+1) + ", dan kolom " + (a + i) + " : " + penonton [i][a]);
             }  else {
                System.out.println("Penonton berada pada baris " + (i+1) + ", dan kolom " + (a+i)+ " : *** " );
             }
         }
     }
     break;
     case 3 :
         System.exit(0);
     default :
         System.out.println("Menu tidak valid");
         System.out.println("Coba lagi");

    }
}
    }
}
