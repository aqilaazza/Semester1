import java.util.Scanner;
public class DoWhileCuti05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int jatahCuti, jmlHari;
        String konfirmasi;
       
        System.out.print("Jatah cuti : ");
        jatahCuti = sc.nextInt();
         
        do {
            System.out.println("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("Jumlah hari : ");
                jmlHari = sc.nextInt();

                if (jmlHari <= jatahCuti) {
                    jatahCuti -= jmlHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    continue;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            } 
            }
        } while (jatahCuti > 0);
    }