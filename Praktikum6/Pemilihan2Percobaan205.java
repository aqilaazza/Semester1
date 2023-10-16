import java.util.Scanner;
public class Pemilihan2Percobaan205 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
    int totalsudut;

        int sudut1, sudut2, sudut3;
        System.out.print("Masukkan sudut 1 : ");
        sudut1 = input05.nextInt();
        System.out.print("Masukkan sudut 2 : ");
        sudut2 = input05.nextInt();
        System.out.print("Masukkan sudut 3 : ");
        sudut3 = input05.nextInt();

        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180 ) {
            if(sudut1 == 90 || sudut2 == 45 || sudut3 == 45){
                System.out.println("Segitiga tersebut adalah segitiga siku siku");
            }else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            }else if ((sudut1==sudut2) || (sudut1==sudut3) || (sudut2==sudut3) || (sudut3==sudut1)) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            }else if ((sudut1 != sudut2) || (sudut2 != sudut3) || (sudut1 != sudut3)) {
                System.out.println("Segitiga tersebut adalah segitiga sembarang"); 

            }
            } else {
            System.out.println("Bukan segitiga");
        }
    }
}