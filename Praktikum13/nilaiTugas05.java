import java.util.Scanner;

public class nilaiTugas05 {
    static int jmlMhs;
    static int jmlMinggu ;
    static int nilaiTertinggi = 0;
    static int mingguNilaiTertinggi = 0;
    static int mhsNilaiTertinggi;

    private static int[][] nilaiMhs; 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan jumlah mahasiswa : ");
            jmlMhs = sc.nextInt();
            System.out.print("Masukkan jumlah minggu : ");
            jmlMinggu = sc.nextInt();
            nilaiMhs = new int [jmlMhs][jmlMinggu];

            jmlNilaiMhs();
            tampilNilaiMhs();
            cariNilaiTertinggi();
            tampilMhsNilaiTinggi();

        }
        public static void jmlNilaiMhs() {
           Scanner sc = new Scanner (System.in);
            for (int a = 0; a < jmlMhs; a++ ) {
                System.out.println("Masukkan nilai Mahasiswa ke- " + (a+1));
                for(int b = 0; b < jmlMinggu; b++) {
                    System.out.print("Minggu ke- " +(b+1)+ " : ");
                    nilaiMhs[a][b]= sc.nextInt();
                }
            }
        }
        public static void tampilNilaiMhs() {
            System.out.println("                                                    DAFTAR NILAI MAHASISWA                   ");
            System.out.println("                 Minggu ke-1     Minggu ke-2     Minggu ke-3     Minggu ke-4     Minggu ke-5     Minggu ke-6     Minggu ke-7");
            for(int a = 0; a < jmlMhs; a++) {
                System.out.print("Mahasiswa ke- " +(a+1)+ " ");
                for(int b = 0; b < jmlMinggu; b++) {
                System.out.print("  ");
                System.out.format("%-15d",  nilaiMhs[a][b]);
                if(b < jmlMinggu ) {
                    System.out.print("");
                }
                }
                System.out.println();
            }
        }
        public static void cariNilaiTertinggi() {
            for(int a = 0; a < jmlMhs; a++) {
                for(int b = 0; b < jmlMinggu; b++) {
                    if (nilaiMhs [a][b] > nilaiTertinggi) {
                        nilaiTertinggi = nilaiMhs[a][b];
                        mingguNilaiTertinggi = b + 1;
                    }
                } 
            }
            System.out.println("Nilai tertinggi adalah " + nilaiTertinggi+ " yang terdapat pada minggu ke- " +mingguNilaiTertinggi);

        }
        public static void tampilMhsNilaiTinggi() {
            int nilaiTertinggi = 0;
            int mhsNilaiTertinggi = 0; 
            for (int a = 0; a < jmlMhs; a++) {
                for(int b = 0; b < jmlMinggu; b++) {
                    if (nilaiMhs[a][b] > nilaiTertinggi) {
                        nilaiTertinggi = nilaiMhs[a][b];
                        mhsNilaiTertinggi = a;
                    }
                }
            }
            System.out.println("Mahasiswa dengan nilai teringgi adalah mahasiswa ke- " +(mhsNilaiTertinggi + 1) + " dengan perolehan nilai " + nilaiTertinggi+ " pada minggu ke-"+mingguNilaiTertinggi );
        }
       
}