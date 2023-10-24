import java.util.Scanner;

public class ArrayRataNilai05 {
    /**
     * @param args
     */
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double rata2, total = 0, ratalulus = 0, ratatdklulus = 0, totlulus= 0, tottdklulus = 0;
        int jmllulus = 0, jmltdklulus = 0, jmlMhs; 

        System.out.print(" Masukkan jumlah Mahasiswa : ");
        jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++ ) {
            System.out.print("Masukkan nilai mahasiswa ke- " +(i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if(nilaiMhs[i] >70) {
               // System.out.println("Mahasiswa ke- " + i + " lulus!");
                jmllulus++;
                totlulus += nilaiMhs[i];
            } else {
               // System.out.println("Mahasiswa ke- " + i + " tidak lulus!");
                jmltdklulus++;
                tottdklulus += nilaiMhs[i];
            }
              
        }
         //rata2 = total/nilaiMhs.length;
         ratalulus = totlulus/jmllulus;
         ratatdklulus = tottdklulus/jmltdklulus;
           // System.out.println("Jumlah mahasiswa yang lulus : " + jmllulus);
          //  System.out.println("Jumlah mahasiswa yang tidak lulus : " + jmltdklulus );
          //  System.out.println("Nilai rata-rata : " + rata2);
          System.out.println("Rata-rata nilai lulus : " +ratalulus);
          System.out.println("Rata-rata nilai tidak lulus : " +ratatdklulus);
    }
}

