import java.util.Scanner;
public class WhileGaji05 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int jmlKaryawan, jmlLembur;
        double gajiLembur, totGajiLembur;
        totGajiLembur = 0;
        gajiLembur = 0;
        String jabatan;
        System.out.println("Masukkan jumlah karyawan : ");
        jmlKaryawan = sc.nextInt();

        int i = 0;

       
        while (i < jmlKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke- " + (i+1) + ": ");
            jabatan = sc.next();
            while (!(jabatan.equalsIgnoreCase("direktur") || jabatan.equalsIgnoreCase("manajer") || jabatan.equalsIgnoreCase("karyawan"))){
                System.out.println("Jabatan Invalid");
                System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
                System.out.print("Masukkan jabatan karyawan ke- " + (i+1) + ": ");
                jabatan = sc.next();
            }
            System.out.print("Masukkan jumlah jam lembur: ");
            jmlLembur = sc.nextInt();
            i++;

            if(jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jmlLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase ("karyawan")) {
                gajiLembur = jmlLembur * 75000;
            } else {
                 System.out.println("Jabatan invalid");
                i--;
                continue;
            }
            totGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur: " + totGajiLembur);

    }
}